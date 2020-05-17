package com.rajesh.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/facebook")
	public String socialMedia() {
//		return "Here is the cricket Bat";
		return "welcome";
	}
}
