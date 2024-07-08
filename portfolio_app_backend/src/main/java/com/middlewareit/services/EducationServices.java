package com.middlewareit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.middlewareit.dao.EducationDao;
import com.middlewareit.models.ContentInfo;
import com.middlewareit.models.Educations;
import com.middlewareit.models.PageInfo;
import com.middlewareit.models.ResponseInfo;
import com.middlewareit.models.ViewResponeInfo;

/**
 * author: Naimul Hassan 
 * date: 7/7/2024
 */
/**
 * service class for the educations view
 */

@Component
public class EducationServices {

	@Autowired
	EducationDao educationDao;

	public ResponseInfo<ViewResponeInfo> getAllInfos() {
		ResponseInfo<ViewResponeInfo> responseInfo = new ResponseInfo<>();

		try {
			List<Educations> response = educationDao.findAll();

			ViewResponeInfo viewResponseInfo = new ViewResponeInfo();
			PageInfo pageInfo = new PageInfo();
			List<ContentInfo> contentInfos = new ArrayList<>();

			for (int i = 0; i < response.size(); i++) {
				Educations educations = response.get(i);
				if (i == 0) {
					pageInfo.setTitle(educations.getPageTitle());
					pageInfo.setSubtitle(educations.getPageSubtitle());
				}
				ContentInfo contentInfo = new ContentInfo();
				contentInfo.setId(educations.getId());
				contentInfo.setSequence(educations.getSequence());
				contentInfo.setTitle(educations.getContentTitle());
				contentInfo.setDescription(educations.getContentDescription());
				contentInfo.setIcon(educations.getContentIcon());

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
