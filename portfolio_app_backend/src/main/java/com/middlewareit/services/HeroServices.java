package com.middlewareit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.middlewareit.dao.HeroDao;
import com.middlewareit.models.Hero;
import com.middlewareit.models.ResponseInfo;

/**
 * author: Naimul Hassan 
 * date: 7/3/2024
 */
/**
 * service class for the hero table
 */ 

@Component
public class HeroServices {
	
	@Autowired
	HeroDao heroDao;

	public ResponseInfo<List<Hero>> getAllInfos() {
		ResponseInfo<List<Hero>> responseInfo = new ResponseInfo<>();

		try {
			List<Hero> response = heroDao.findAll();

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
