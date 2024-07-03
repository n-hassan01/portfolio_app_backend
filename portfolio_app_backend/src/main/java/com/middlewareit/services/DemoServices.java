package com.middlewareit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.middlewareit.dao.DemoDao;
import com.middlewareit.models.Demo;
import com.middlewareit.models.ResponseInfo;

/**
 * author: Naimul Hassan date: 7/3/2024
 */

@Component
public class DemoServices {

	@Autowired
	DemoDao demoDao;

	public ResponseInfo<List<Demo>> getAllInfos() {
		ResponseInfo<List<Demo>> responseInfo = new ResponseInfo<>();

		try {
			List<Demo> response = demoDao.findAll();

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
