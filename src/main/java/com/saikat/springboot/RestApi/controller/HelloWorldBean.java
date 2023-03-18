package com.saikat.springboot.RestApi.controller;

public class HelloWorldBean {
	private String name1;

	public HelloWorldBean(String name2) {
		this.name1=name2;
	}

	public String getName() {
		return name1;
	}

	public void setName(String name) {
		this.name1 = name;
	}

//	@Override
//	public String toString() {
//		return "HelloWorldBean [name=" + name + "]";
//	}

}
