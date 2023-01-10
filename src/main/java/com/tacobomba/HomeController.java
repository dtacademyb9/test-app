package com.tacobomba;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/index.html")
	public String homeAlternative() {
		return "index";
	}
	
	@GetMapping("/menu.html")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/about.html")
	public String about() {
		return "about";
	}
	
	@GetMapping("/blog.html")
	public String blog() {
		return "blog";
	}
	
	@GetMapping("/gallery.html")
	public String gallery() {
		return "gallery";
	}
	
	@GetMapping("/reservation.html")
	public String reservation() {
		return "reservation";
	}
	
	@GetMapping("/stuff.html")
	public String stuff() {
		return "stuff";
	}
	
	@GetMapping("/contact.html")
	public String contact() {
		return "contact";
	}
	
	@GetMapping("/blog-details.html")
	public String blogDetails() {
		return "blog-details";
	}
	
	

}
