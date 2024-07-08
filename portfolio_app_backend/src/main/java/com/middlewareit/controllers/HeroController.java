package com.middlewareit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.middlewareit.models.Hero;
import com.middlewareit.models.ResponseInfo;
import com.middlewareit.services.HeroServices;

/**
 * author: Naimul Hassan 
 * date: 7/6/2024
 */
/**
 * controller class for the hero table
 */

@RestController
@RequestMapping("hero")
public class HeroController {

	@Autowired
	HeroServices heroServices;

	@GetMapping("all")
	public ResponseInfo<List<Hero>> getAllMethod() {
		return heroServices.getAllInfos();
	}

}
