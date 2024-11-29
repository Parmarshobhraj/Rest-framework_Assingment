package com.constructorinjection;

public class User {
	
	private int id;
	private String name;
	private long contact;
	
	public User(int id, String name, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
}
