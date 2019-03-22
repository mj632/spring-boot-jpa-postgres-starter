package com.example.demoOne.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.example.demoOne.bean.Bean;

@Controller
public interface DemoService extends JpaRepository<Bean, String>{
	
	List<Bean> findAll();
}
