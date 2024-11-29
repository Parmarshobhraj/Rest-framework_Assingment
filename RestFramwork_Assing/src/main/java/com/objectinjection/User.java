package com.objectinjection;

public class User {

	private Address address;
	public User(Address address) {
		super();
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [address=" + address + "]";
	}
}
