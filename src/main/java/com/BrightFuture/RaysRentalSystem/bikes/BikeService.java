package com.BrightFuture.RaysRentalSystem.bikes;

public interface BikeService {
	
	public Bike addNewBike(Bike bike);
	
	public Bike hireBike();

	public int retrieveAvailableAdultBikeCount();

	public int retrieveAvailableChildBikeCount();
}
