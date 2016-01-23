package com.mymvc.myapp.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Form {
	
	@NotNull
	@Size(min=1,max=3)
	private String name;
	@NotNull(message="Cannot be empty")
	@Min(value = 2 , message="Please insert correct id")
	private Integer age;
	@NotNull(message="Cannot be empty")
	@Min(value = 5 , message="Please insert correct id")
	private Integer id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
