package com.saikat.springboot.RestApi.versioning.controller;

public class Persionv2 {
	private Name name;

	public Persionv2(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Persionv2 [name=" + name + "]";
	}

}
