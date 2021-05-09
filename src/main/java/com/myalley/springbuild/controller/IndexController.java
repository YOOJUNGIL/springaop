package com.myalley.springbuild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@GetMapping("/index")
	public ModelAndView index(Model model) {
		ModelAndView mv = new ModelAndView("index");
		model.addAttribute("name", "yoojungil");
		mv.addObject(model);
		return mv;
	}

	@GetMapping("/intro")
	public String intro(Model model) {
		model.addAttribute("name", "yoojungil");
		return "intro";
	}
	
}
