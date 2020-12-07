package com.vwits.model;

public class Student {
	int roll_no;
	String name;
	String password;
	String email;
	int contact;
	public Student(int roll_no, String name, String password, String email, int contact) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.password = password;
		this.email = email;
		this.contact = contact;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", contact=" + contact + "]";
	}
	

}
