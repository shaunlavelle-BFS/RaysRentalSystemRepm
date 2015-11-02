package com.BrightFuture.RaysRentalSystem.bikes;

import com.BrightFuture.RaysRentalSystem.constants.BikeSize;

public interface BikeService {
	
	public Bike addNewBike(Bike bike);
	
	public int retrieveAvailableBikeCount(BikeSize bikeSize);
}