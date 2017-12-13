package com.codelab.springcloud.demo.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RefreshScope
public class CafeController {
	
	@Value("${name}")
	String name;
	
	@Value("${price}")
	String price;
	
	@Value("${servicestart}")
	String opentime;
	
	@Value("${serviceend}")
	String closetime;
	
	@Value("${connstring}")
	String connString;
	
	@RequestMapping("/cafe")
	public String getCafe(Model m) {
		
		m.addAttribute("name", name);
		m.addAttribute("price", price);
		m.addAttribute("opentime", opentime);
		m.addAttribute("closetime", closetime);
		m.addAttribute("connstring", connString);
		
		return "homeview";
	}

}
