package com.saikat.springboot.RestApi.versioning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Versioning {
	//below is URI versioning.
	@GetMapping(path="/v1")
	public Persionv1 URIv1 () {
		return new Persionv1("Saikat Chatterjee");
		
	}
	@GetMapping(path="/v2")
	public Persionv2 URIv2() {
		return new Persionv2(new Name("Saikat","Chatterjee"));
	}
	
	//below is Request Parameter.
	//localhost:portnumber/Person?Version=1
	@GetMapping(path="/Person",params="Version=1")
	public Persionv1 Parameter() {
		return new Persionv1("Saikat Chatterjee");
		
	}
	@GetMapping(path="/Person",params="Version=2")
	public Persionv2 Param() {
		return new Persionv2(new Name("Saikat","Chatterjee"));
	}
	//below is Header Versioning
	@GetMapping(path="/Person/header",headers="X-API-VERSION=1")
	public Persionv1 PersonHeader() {
		return new Persionv1("Saikat Chatterjee");
	}
	@GetMapping(path="/Person/header",headers="X-API-VERSION=2")
	public Persionv2 PersonHeader2() {
		return new Persionv2(new Name("Saikat","Chatterjee"));
	}
	
	//below is media type versioning
	@GetMapping(path="/Person/media",produces="application/vnd.company.app-v1+json")
	public Persionv1 PersonMedia1() {
		return new Persionv1("Saikat Chatterjee");
	}
	@GetMapping(path="/Person/media",produces="application/vnd.company.app-v2+json")
	public Persionv2 PersonMedia2() {
		return new Persionv2(new Name("Saikat","Chatterjee"));
	}
		

}
