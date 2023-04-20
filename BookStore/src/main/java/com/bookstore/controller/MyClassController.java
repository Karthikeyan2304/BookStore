package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.MyBookService;

@Controller
public class MyClassController {

	@Autowired
	private MyBookService mybookservice;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id")int id)
	{
		mybookservice.deleteById(id);
		return "redirect:/mybook";
	}
}

