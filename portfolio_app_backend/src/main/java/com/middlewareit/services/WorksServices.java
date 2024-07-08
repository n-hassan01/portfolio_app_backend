package com.middlewareit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.middlewareit.dao.WorksDao;
import com.middlewareit.models.ContentInfo;
import com.middlewareit.models.PageInfo;
import com.middlewareit.models.ResponseInfo;
import com.middlewareit.models.ViewResponeInfo;
import com.middlewareit.models.Works;

/**
 * author: Naimul Hassan 
 * date: 7/7/2024
 */
/**
 * service class for the works view
 */

@Component
public class WorksServices {

	@Autowired
	WorksDao worksDao;

	public ResponseInfo<ViewResponeInfo> getAllInfos() {
		ResponseInfo<ViewResponeInfo> responseInfo = new ResponseInfo<>();

		try {
			List<Works> response = worksDao.findAll();

			ViewResponeInfo viewResponseInfo = new ViewResponeInfo();
			PageInfo pageInfo = new PageInfo();
			List<ContentInfo> contentInfos = new ArrayList<>();

			for (int i = 0; i < response.size(); i++) {
				Works works = response.get(i);
				if (i == 0) {
					pageInfo.setTitle(works.getPageTitle());
					pageInfo.setSubtitle(works.getPageSubtitle());
				}
				ContentInfo contentInfo = new ContentInfo();
				contentInfo.setId(works.getId());
				contentInfo.setSequence(works.getSequence());
				contentInfo.setTitle(works.getContentTitle());
				contentInfo.setDescription(works.getContentDescription());
				contentInfo.setIcon(works.getContentIcon());

				contentInfos.add(contentInfo);
			}

			viewResponseInfo.setPageInfo(pageInfo);
			viewResponseInfo.setContentInfo(contentInfos);

			responseInfo.setStatusCode(HttpStatus.OK.value());
			responseInfo.setMessage("Successfully fetched!");
			responseInfo.setData(viewResponseInfo);

			return responseInfo;
		} catch (Exception e) {
			e.printStackTrace();
		}

		responseInfo.setStatusCode(HttpStatus.BAD_REQUEST.value());
		responseInfo.setMessage("BAD REQUEST");
		responseInfo.setData(null);

		return null;
	}

}
