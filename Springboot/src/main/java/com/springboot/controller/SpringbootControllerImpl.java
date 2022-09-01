package com.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.service.SpringbootService;
import com.springboot.vo.SpringbootVO;

@Controller("springbootController")
public class SpringbootControllerImpl implements SpringbootController {
	@Autowired
	private SpringbootService springbootService;
	@Autowired
	private SpringbootVO springbootVO;

	@Override
	@RequestMapping(value="/test9.do", method = RequestMethod.POST)
	public ModelAndView listSpringboot(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List membersList = springbootService.listSpringboot();
		ModelAndView mav = new ModelAndView("listSpringboot");
		mav.addObject("membersList", membersList);
		return mav;
	}
	@RequestMapping(value ="/hi.do", method = RequestMethod.GET)
	public ModelAndView hi(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView("Springbootform");
		return mav;
	}

}
