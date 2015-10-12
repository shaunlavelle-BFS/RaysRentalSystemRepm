package com.BrightFuture.RaysRentalSystem.constants;

public enum Gender
{
	MALE("Male"), 
	FEMALE("Female");

	private String prettyName;

	private Gender(String prettyName)
	{
		this.prettyName = prettyName;
	}
	
	public String getPrettyName()
	{
		return prettyName;
	}
}
