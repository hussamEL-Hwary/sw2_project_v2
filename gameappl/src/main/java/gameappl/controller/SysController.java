package gameappl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SysController {
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}

}
