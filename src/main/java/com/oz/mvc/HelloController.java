package com.oz.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
		@RequestMapping("irHola")
	public ModelAndView redirection(){
			//ModelAndView mv = new ModelAndView("hola","mensaje","Hola soy un mensaje");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hola");
		mv.addObject("mensaje","Hola soy un mensaje desde un Controller usando mensaje var");
		return mv;
	}
	
}
