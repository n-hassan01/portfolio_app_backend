package com.middlewareit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.middlewareit.dao.HiremeDao;
import com.middlewareit.models.Hireme;
import com.middlewareit.models.ResponseInfo;

/**
 * author: Naimul Hassan 
 * date: 7/7/2024
 */
/**
 * service class for the hireme table
 */

@Component
public class HiremeServices {

	@Autowired
	HiremeDao hiremeDao;

	public ResponseInfo<List<Hireme>> getAllInfos() {
		ResponseInfo<List<Hireme>> responseInfo = new ResponseInfo<>();

		try {
			List<Hireme> response = hiremeDao.findAll();

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
