package com.BrightFuture.RaysRentalSystem.constants;

public enum RentDuration {
	HALF_DAY("Half Day"),
	FULL_DAY("Full Day");
	
	private String prettyName;

	private RentDuration(String prettyName)
	{
		this.prettyName = prettyName;
	}
	
	public String getPrettyName()
	{
		return prettyName;
	}
}