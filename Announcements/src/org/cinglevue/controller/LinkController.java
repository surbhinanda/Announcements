package org.cinglevue.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;



public class LinkController {

	@RequestMapping(value="/")
	public ModelAndView mainPage() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/index")
	public ModelAndView indexPage() {
		return new ModelAndView("home");
	}
}
