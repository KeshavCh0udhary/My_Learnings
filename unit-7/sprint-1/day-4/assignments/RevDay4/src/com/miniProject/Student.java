package com.miniProject;

public class Student {
	
	private Integer Id;
	private String name;
	private Integer marks;
	private String section;
	private Address address;
	
	public Student(Integer id, String name, Integer marks, String section, Address address) {
		super();
		Id = id;
		this.name = name;
		this.marks = marks;
		this.section = section;
		this.address = address;
	}
	public Student() {
		
		super();
		this.Id=1 + (int)(Math.random() * (100 ));
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", marks=" + marks + ", section=" + section + ", address="
				+ address + "]";
	}
	
	
}

