package com.middlewareit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.middlewareit.models.ResponseInfo;
import com.middlewareit.models.ServicesView;
import com.middlewareit.services.ServicesViewServices;

/**
 * author: Naimul Hassan 
 * date: 7/6/2024
 */
/**
 * controller class for the services view
 */

@RestController
@RequestMapping("services")
public class ServicesViewController {
	
	@Autowired
	ServicesViewServices servicesViewServices;

	@GetMapping("all")
	public ResponseInfo<List<ServicesView>> getAllMethod() {
		return servicesViewServices.getAllInfos();
	}

}
