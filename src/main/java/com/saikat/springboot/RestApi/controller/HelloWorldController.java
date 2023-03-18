package com.saikat.springboot.RestApi.controller;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	private MessageSource ms;
	public HelloWorldController(MessageSource ms) {
		this.ms=ms;
	}
	@RequestMapping(method=RequestMethod.GET,path="/hello")
	public String home() {
		return "Wellcome";
	}
	
	@GetMapping(path="/hello/{name4}")
	public HelloWorldBean name3(@PathVariable String name4) {
		return new HelloWorldBean(String.format("Wellcome %s", name4));
	}
	@GetMapping(path="/hello/i18n")
	public String helloi18n() {
		Locale locale=LocaleContextHolder.getLocale();
		return ms.getMessage("good.morning.message", null, "Default Message",locale);
	}

}
