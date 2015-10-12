package com.BrightFuture.RaysRentalSystem.constants;

public enum Status
{
	AVAILABLE("Available"), 
	MAINTENANCE("Maintenance"),
	ON_RENT("On Rent");
	
	private String prettyName;

	private Status(String prettyName)
	{
		this.prettyName = prettyName;
	}
	
	public String getPrettyName()
	{
		return prettyName;
	}
}
