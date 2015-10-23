package com.BrightFuture.RaysRentalSystem.constants;

public enum Classification
{
	MOUNTAIN("Mountain"), 
	ROAD("Road"),
	TANDEM("Tandem");

	private String prettyName;

	private Classification(String prettyName)
	{
		this.prettyName = prettyName;
	}
	
	public String getPrettyName()
	{
		return prettyName;
	}
}