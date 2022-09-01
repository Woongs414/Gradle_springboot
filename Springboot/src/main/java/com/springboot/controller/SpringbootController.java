package com.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface SpringbootController {
	public ModelAndView listSpringboot(HttpServletRequest request, HttpServletResponse response)throws Exception;

}
