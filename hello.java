package com.offcn.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.offcn.po.Phone;
import com.offcn.service.PhoneService;

@Controller
public class PhoneController {
	
	@Resource
	PhoneService phoneservice;
	@RequestMapping("/serach")
	public String getMobile(Model model,@RequestParam String mobileNum){
		Phone phone=phoneservice.serachBynum(mobileNum);
		model.addAttribute("phone", phone);
		System.out.println(phone);
		return "result";
	}
}
