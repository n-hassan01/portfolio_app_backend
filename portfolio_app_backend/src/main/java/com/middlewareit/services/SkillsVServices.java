package com.middlewareit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.middlewareit.dao.SkillsDao;
import com.middlewareit.models.ResponseInfo;
import com.middlewareit.models.SkillsV;

/**
 * author: Naimul Hassan 
 * date: 7/3/2024
 */
/**
 * service class for the hero table
 */

@Component
public class SkillsVServices {

	@Autowired
	SkillsDao skillsDao;

	public ResponseInfo<List<SkillsV>> getAllInfos() {
		ResponseInfo<List<SkillsV>> responseInfo = new ResponseInfo<>();

		try {
			List<SkillsV> response = skillsDao.findAll();

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
