package com.example.form;

import javax.validation.constraints.NotBlank;


public class UserForm {

	@NotBlank(message = "値を入力してください")
	private String name;
	@NotBlank(message = "値を入力してください")
	private String age;
	@NotBlank(message = "値を入力してください")
	private String comment;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

}

