package com.middlewareit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.middlewareit.dao.ServicesViewDao;
import com.middlewareit.models.ResponseInfo;
import com.middlewareit.models.ServicesView;

/**
 * author: Naimul Hassan 
 * date: 7/7/2024
 */
/**
 * service class for the services view
 */

@Component
public class ServicesViewServices {
	
	@Autowired
	ServicesViewDao servicesViewDao;

	public ResponseInfo<List<ServicesView>> getAllInfos() {
		ResponseInfo<List<ServicesView>> responseInfo = new ResponseInfo<>();

		try {
			List<ServicesView> response = servicesViewDao.findAll();

			responseInfo.setStatusCode(HttpStatus.OK.value());
			responseInfo.setMessage("Successfully fetched!");
			responseInfo.setData(response);

			return responseInfo;
		} catch (Exception e) {
			e.printStackTrace();
		}

		responseInfo.setStatusCode(HttpStatus.BAD_REQUEST.value());
		responseInfo.setMessage("BAD REQUEST");
		responseInfo.setData(new ArrayList<>());

		return null;
	}

}
