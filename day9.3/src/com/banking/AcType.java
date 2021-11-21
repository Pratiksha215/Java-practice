package com.banking;

public enum AcType {
	SAVING, CURRENT, FD, LOAN, DMAT;
	@Override
	public String toString()
	{
		return "A/C Type "+name().toLowerCase();
	}
}
