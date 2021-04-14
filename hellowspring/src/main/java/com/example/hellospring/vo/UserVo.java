package com.example.hellospring.vo;

public class UserVo {
	//필드
	private Long age;
	private String email;
	private String password;
	private String grnder;
	private String name;
	
	//생성자
	public UserVo() {
		
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGrnder() {
		return grnder;
	}

	public void setGrnder(String grnder) {
		this.grnder = grnder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserVo [age=" + age + ", email=" + email + ", password=" + password + ", grnder=" + grnder + ", name="
				+ name + "]";
	}
	
	
	
}
