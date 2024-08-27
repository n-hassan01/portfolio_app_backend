package com.middlewareit.auth.jwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jwt")
public class JwtTestController {

	@GetMapping("test")
	public String getMethod() {
		return "success";
	}

}
