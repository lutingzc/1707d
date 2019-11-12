package com.lutingting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("admin")
public class AdminController {

	@RequestMapping("index")
	public String index() {
		return "admin/index";
	}
	@RequestMapping("articles")
	public String articles() {
		return "admin/article/list";
	}
	@RequestMapping("users")
	public String users(@RequestParam(defaultValue="")String name) {
		return "admin/user/list";
	}
	@RequestMapping("list")
	public String list1() {
		return "amdin/user/list";
	}
	
}
