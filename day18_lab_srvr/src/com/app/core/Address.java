package com.app.core;

import java.io.Serializable;

public class Address  implements Serializable   {
	private String city, state, phoneNo;

	public Address(String city, String state, String phoneNo) {
		super();
		this.city = city;
		this.state = state;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", phoneNo=" + phoneNo + "]";
	}
	
}
