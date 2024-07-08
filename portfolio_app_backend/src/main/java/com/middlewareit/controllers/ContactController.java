package com.middlewareit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.middlewareit.models.ResponseInfo;
import com.middlewareit.models.ViewResponeInfo;
import com.middlewareit.services.ContactServices;

/**
 * author: Naimul Hassan 
 * date: 7/7/2024
 */
/**
 * controller class for the contact view
 */

@RestController
@RequestMapping("contact")
public class ContactController {

	@Autowired
	ContactServices contactServices;

	@GetMapping("all")
	public ResponseInfo<ViewResponeInfo> getAllMethod() {
		return contactServices.getAllInfos();
	}

}
