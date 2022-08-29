package com.myspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@ResponseBody
	@RequestMapping("/")
	public String home() {
		System.out.print("Hello Boot!");
		return "Hello Boot!";
}
	
	@RequestMapping("/woong.do")
	public String hello(Model model) {
		System.out.print("안녕하세요");
		model.addAttribute("message","hello.jsp입니다.!");
		return "hello";
	}
}
