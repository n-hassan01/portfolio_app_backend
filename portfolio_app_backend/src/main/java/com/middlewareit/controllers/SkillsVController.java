package com.middlewareit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.middlewareit.models.ResponseInfo;
import com.middlewareit.models.SkillsV;
import com.middlewareit.services.SkillsVServices;

/**
 * author: Naimul Hassan 
 * date: 7/6/2024
 */
/**
 * controller class for the hero table
 */

@RestController
@RequestMapping("skills")
public class SkillsVController {

	@Autowired
	SkillsVServices skillsVServices;

	@GetMapping("all")
	public ResponseInfo<List<SkillsV>> getAllMethod() {
		return skillsVServices.getAllInfos();
	}

}
