package com.mjv.projetofinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class EasyJobDiversiTech1Application {

	@GetMapping
	public ModelAndView swaggwerUi() {
		
		return new ModelAndView("redirect:/swagger-ui/");
	
	}
	public static void main(String[] args) {
		SpringApplication.run(EasyJobDiversiTech1Application.class, args);
	}

}
