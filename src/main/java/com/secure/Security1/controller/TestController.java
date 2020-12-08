package com.secure.Security1.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class TestController {
	
//	@GetMapping("/all")
//	public String allAccess() {
//		return ("<h1>Public Content<h1>");
//	}

	
	@GetMapping("/user")

	public String userAccess() {
		return ("<h1>user<h1>");
	}

	@GetMapping("/admin")

	public String adminAccess() {
		return ("<h1>admin<h1>");
	}
}
