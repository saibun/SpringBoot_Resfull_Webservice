package com.saikat.springboot.RestApi.versioning.controller;

public class Persionv1 {
	private String con_num;

	public Persionv1(String con_num) {
		super();
		this.con_num = con_num;
	}

	public String getCon_num() {
		return con_num;
	}

	@Override
	public String toString() {
		return "Persionv1 [con_num=" + con_num + "]";
	}
	
	

}
