package gimo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import gimo.mapper.gimoMapper;

@Controller
public class gimoController {
	
	
	@RequestMapping("/")
	public String home()
	{
		return "/haha";
	}

}
