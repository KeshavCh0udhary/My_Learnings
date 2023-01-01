package com.miniProject;

public class Address {
	
	private String city;
	private String state;
	private Integer pincode;
	
	public Address(String city, String state, Integer pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city = " + city + ", state = " + state + ", pincode = " + pincode + "]";
	}

}
