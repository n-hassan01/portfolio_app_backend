package com.middlewareit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.middlewareit.dao.ContactDao;
import com.middlewareit.models.Contact;
import com.middlewareit.models.ContentInfo;
import com.middlewareit.models.PageInfo;
import com.middlewareit.models.ResponseInfo;
import com.middlewareit.models.ViewResponeInfo;

/**
 * author: Naimul Hassan 
 * date: 7/7/2024
 */
/**
 * service class for the contact view
 */

@Component
public class ContactServices {

	@Autowired
	ContactDao contactDao;

	public ResponseInfo<ViewResponeInfo> getAllInfos() {
		ResponseInfo<ViewResponeInfo> responseInfo = new ResponseInfo<>();

		try {
			List<Contact> response = contactDao.findAll();

			ViewResponeInfo viewResponseInfo = new ViewResponeInfo();
			PageInfo pageInfo = new PageInfo();
			List<ContentInfo> contentInfos = new ArrayList<>();

			for (int i = 0; i < response.size(); i++) {
				Contact contact = response.get(i);
				if (i == 0) {
					pageInfo.setTitle(contact.getPageTitle());
					pageInfo.setSubtitle(contact.getPageSubtitle());
				}
				ContentInfo contentInfo = new ContentInfo();
				contentInfo.setId(contact.getId());
				contentInfo.setSequence(contact.getSequence());
				contentInfo.setTitle(contact.getContentTitle());
				contentInfo.setDescription(contact.getContentDescription());
				contentInfo.setIcon(contact.getContentIcon());

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
