package com.saikat.springboot.RestApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping(method=RequestMethod.GET,path="/hello")
	public String home() {
		return "Wellcome";
	}
	
	@GetMapping(path="/hello/{name}")
	public HelloWorldBean name(@PathVariable String name) {
		return new HelloWorldBean(String.format("Wellcome %s", name));
	}

}
