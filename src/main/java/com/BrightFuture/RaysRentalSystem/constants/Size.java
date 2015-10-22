package com.BrightFuture.RaysRentalSystem.constants;

public enum Size
{
	LARGE("Large"), 
	STANDARD("Standard"),
	SMALL("Small");

	private String prettyName;

	private Size(String prettyName)
	{
		this.prettyName = prettyName;
	}
	
	public String getPrettyName()
	{
		return prettyName;
	}
}
