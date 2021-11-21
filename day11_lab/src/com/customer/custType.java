package com.customer;

public enum custType {
	SILVER, GOLD, PLATINUM;
	@Override
	public String toString() {
		return "Customer Type : "+name().toLowerCase();
	}
	

}
