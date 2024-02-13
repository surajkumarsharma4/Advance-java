package com.jsp.serialization;

import java.io.Serializable;

public class Student implements Serializable{
	private int id;
	private String name;
	private String email;
	public Student(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.email=email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
