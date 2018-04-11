package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;
import com.example.demo.service.RedisService;

@RestController
public class RedisController {

	@Autowired
	private RedisService redisService;

	@GetMapping("/findAll")
	public List<User> findAll() {
		return redisService.findAll();
	}
}
