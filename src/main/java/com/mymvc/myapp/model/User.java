package com.mymvc.myapp.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;


public class User {
	@NotNull(message="Cannot be empty")
	@Range(min=18, message="You cannot subscribe if you are under 18 years old.")
	   private Integer age;
	
	@NotNull(message="Cannot be empty")	
	   private String name;
	
	@NotNull(message="Cannot be empty")
	@Min(value = 2 , message="Please insert correct id")
	   private Integer id;

	   public void setAge(Integer age) {
	      this.age = age;
	   }
	   public Integer getAge() {
	      return age;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }

	   public void setId(Integer id) {
	      this.id = id;
	   }
	   public Integer getId() {
	      return id;
	   }
	}