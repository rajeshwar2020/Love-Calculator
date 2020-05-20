package com.rajesh.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rajesh.lc.api.RegistrationInfoDTO;
import com.rajesh.lc.api.UserInfoDTO;

@Controller
public class LCHomeContoller {

	@RequestMapping("/")
	public String visitHomePage(@ModelAttribute("referenceForView") UserInfoDTO userInfo) {
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultsPage(@ModelAttribute("objectReference") UserInfoDTO userinfo) {
		
//		model.addAttribute("objectReference", userinfo);
		return "results-page";
	}
	
	@RequestMapping("/register")
	public String registerPage(@ModelAttribute("regInfo") RegistrationInfoDTO regInfo) {
		return "register";
	}
	
	@RequestMapping("/registrationSuccessful")
	public String registrationSuccessful(@ModelAttribute("registrationInfoObj") RegistrationInfoDTO obj) {
//		RegistrationInfoDTO obj = new RegistrationInfoDTO();
//		model.addAttribute("registrationInfo", obj);
		return "registration-completed";
	}
}
