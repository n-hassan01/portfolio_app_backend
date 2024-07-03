package com.middlewareit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.middlewareit.models.Demo;
import com.middlewareit.models.ResponseInfo;
import com.middlewareit.services.DemoServices;

/**
 * author: Naimul Hassan date: 7/3/2024
 */

@RestController
@RequestMapping("demo")
public class DemoController {

	@Autowired
	DemoServices demoService;

	@GetMapping("all")
	public ResponseInfo<List<Demo>> getAllMethod() {
		return demoService.getAllInfos();
	}

}
