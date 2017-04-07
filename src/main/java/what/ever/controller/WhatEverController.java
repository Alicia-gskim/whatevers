package what.ever.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import what.ever.sevice.WhatEverService;

@Controller
public class WhatEverController {
    
    @Autowired
    private WhatEverService whatEverService;
    
    public WhatEverController() {
	//default Constructor
    }
    
    @RequestMapping(value="/")
    public ModelAndView index() {
	ModelAndView mav = new ModelAndView("index");
	
	mav.addObject("msg", "hello");
	
	return mav;
    }
    
    @RequestMapping(value="/first")
    public ModelAndView first() {
	Map<String, Object> result = whatEverService.selectTblInfo();
	
	ModelAndView mav = new ModelAndView("jsonView");
	
	mav.addObject("data", result);
	
	return mav;
    }
}