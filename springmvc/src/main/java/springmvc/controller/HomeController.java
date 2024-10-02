package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("This is home url");
		return "index";
	}
	
	@RequestMapping("/service")
	public String service() {
		System.out.println("This is service url");
		return "service";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about url");
		return "about";
	}
}
