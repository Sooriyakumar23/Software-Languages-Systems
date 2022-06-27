package com.sooriya.web.model;

public class Actor {
	private int aid;
	private String firstName;
	private String lastName;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Actor [aid=" + aid + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
