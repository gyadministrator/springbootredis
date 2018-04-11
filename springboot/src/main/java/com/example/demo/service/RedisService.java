package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.bean.User;

@Service
public class RedisService {

	@Cacheable(value = "findAll")
	public List<User> findAll() {
		System.out.println("如果没有打印,说明走了缓存");

		List<User> list = new ArrayList<>();

		User user1 = new User();
		user1.setAddress("贵阳");
		user1.setBirthday(new Date());
		user1.setSex("男");
		user1.setUsername("测试");

		User user2 = new User();
		user2.setAddress("贵阳");
		user2.setBirthday(new Date());
		user2.setSex("男");
		user2.setUsername("测试");

		list.add(user1);
		list.add(user2);

		return list;
	}
}
