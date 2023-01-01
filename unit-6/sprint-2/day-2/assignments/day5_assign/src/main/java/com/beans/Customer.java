package com.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type;

@Table(name = "emp")
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String name;
	private String email;
	private int mobile;
	
	@ElementCollection
	@Embedded
	@JoinTable(name = "emp_adr")
	private List<Address> add= new ArrayList<Address>();
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", add=" + add
				+ "]";
	}


	public Customer(int cid, String name, String email, int mobile) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	} 
	
	
	public Customer() {
		
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
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


	public int getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	public List<Address> getAdd() {
		return add;
	}


	public void setAdd(List<Address> add) {
		this.add = add;
	}
	
}
