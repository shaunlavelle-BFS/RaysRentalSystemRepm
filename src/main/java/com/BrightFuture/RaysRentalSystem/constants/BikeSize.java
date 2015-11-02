package com.BrightFuture.RaysRentalSystem.constants;

public enum BikeSize
{
	LARGE_MALE("Large Male"),
	LARGE_FEMALE("Large Female"),
	STANDARD_FEMALE("Standard Female"),
	STANDARD_MALE("Standard Male"),
	CHILD("Child");

	private String prettyName;

	private BikeSize(String prettyName)
	{
		this.prettyName = prettyName;
	}
	
	public String getPrettyName()
	{
		return prettyName;
	}
}
