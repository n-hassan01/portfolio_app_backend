package com.middlewareit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.middlewareit.models.Hireme;
import com.middlewareit.models.ResponseInfo;
import com.middlewareit.services.HiremeServices;

/**
 * author: Naimul Hassan 
 * date: 7/6/2024
 */
/**
 * controller class for the hero table
 */

@RestController
@RequestMapping("hireme")
public class HiremeController {

	@Autowired
	HiremeServices hiremeServices;

	@GetMapping("all")
	public ResponseInfo<List<Hireme>> getAllMethod() {
		return hiremeServices.getAllInfos();
	}

}
