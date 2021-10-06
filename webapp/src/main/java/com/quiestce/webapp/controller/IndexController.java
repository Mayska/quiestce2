package com.quiestce.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Data;

@Data
@Controller
public class IndexController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("index", "index");
		return "index";
	}
}