package com.example.demoOne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoOne.bean.Bean;
import com.example.demoOne.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	DemoService dService;
	
	
	@GetMapping("/getall")
	public String getAllNames() {
		List<Bean> l = dService.findAll();
		for(Bean b : l)
			System.out.println("name ::: " + b.getName());
		return "check names";
	}

}
