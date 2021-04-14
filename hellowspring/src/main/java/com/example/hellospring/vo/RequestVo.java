package com.example.hellospring.vo;

public class RequestVo {
	//필드
	private String name;
	private Long no;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "RequestVo [name=" + name + ", no=" + no + "]";
	}
	
}
