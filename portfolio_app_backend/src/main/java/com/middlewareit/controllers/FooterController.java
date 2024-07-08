package com.middlewareit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.middlewareit.models.Footer;
import com.middlewareit.models.ResponseInfo;
import com.middlewareit.services.FooterServices;

/**
 * author: Naimul Hassan 
 * date: 7/6/2024
 */
/**
 * controller class for the footer table
 */

@RestController
@RequestMapping("footer")
public class FooterController {

	@Autowired
	FooterServices footerServices;

	@GetMapping("all")
	public ResponseInfo<List<Footer>> getAllMethod() {
		return footerServices.getAllInfos();
	}

}
