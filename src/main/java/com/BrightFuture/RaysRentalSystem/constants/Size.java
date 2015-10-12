package com.BrightFuture.RaysRentalSystem.constants;

public enum Size
{
	KIDS("Children's"), 
	Adults("Adults");

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
