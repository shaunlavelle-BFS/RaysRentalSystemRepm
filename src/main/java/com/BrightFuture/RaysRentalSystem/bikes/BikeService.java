package com.BrightFuture.RaysRentalSystem.bikes;

import java.util.List;

import com.BrightFuture.RaysRentalSystem.constants.BikeSize;

public interface BikeService {
	
	public Bike addNewBike(Bike bike);
	
	public List<Bike> retrieveAvailableBikes(BikeSize bikeSize, Boolean available);
}