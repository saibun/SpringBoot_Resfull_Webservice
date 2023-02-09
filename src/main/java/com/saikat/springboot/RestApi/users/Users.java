package com.saikat.springboot.RestApi.users;

import java.time.LocalDate;

public class Users {
	private Integer id;
	private String name;
	private LocalDate birth;
	public Users(Integer id, String name, LocalDate birth) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirth() {
		return birth;
	}
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", birth=" + birth + "]";
	}

}
