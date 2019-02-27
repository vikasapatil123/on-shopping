package net.kzn.onshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value = { "/", "home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings", "welcome to webmvc project");
		return mv;
	}

	/*@RequestMapping("test")
	public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting) {
		if(greeting==null)
			greeting="Hello,welcome in web MVC";
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings", greeting);
		return mv;
	}*/
	
/*	@RequestMapping("/test/{greeting}")
	public ModelAndView test(@PathVariable(value="greeting")String greeting) {
		if(greeting==null)
			greeting="Hello,welcome in web MVC";
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings", greeting);
		return mv;
	}*/
}
