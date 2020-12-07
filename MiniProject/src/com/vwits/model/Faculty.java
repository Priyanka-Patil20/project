package com.vwits.model;

public class Faculty {
	int id;
	String name;
	String password;
	String email;
	int contact;
	public Faculty(int id, String name, String password, String email, int contact) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.contact = contact;
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
		return "Faculty [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", contact="
				+ contact + "]";
	}
	

}
