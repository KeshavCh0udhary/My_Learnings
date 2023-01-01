package com.Revision;

public class Cat extends Animal{

	private String nickName;
	
	public Cat(String name, String nickName) {
		super(name);
		this.nickName = nickName;
	}

	public Cat(String nickName) {
		this.nickName = nickName;
	}
    
	public Cat() {
		super();
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Cat is making noise");
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat is eating");
	}
	
	public void jump() {
		System.out.println("Cat is jumping");
	}
	
	
	

}
