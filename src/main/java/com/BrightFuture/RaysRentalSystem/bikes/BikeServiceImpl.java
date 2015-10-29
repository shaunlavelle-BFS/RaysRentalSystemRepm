package com.BrightFuture.RaysRentalSystem.bikes;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BrightFuture.RaysRentalSystem.constants.Size;

@Service
@Transactional
public class BikeServiceImpl implements BikeService {

	@Autowired
	BikeDAO bikeDAO;
	
	@Override
	public Bike addNewBike(Bike bike) {
		return null;
	}

	@Override
	public Bike hireBike() {
		// TODO Auto-generated method stub
		//need a get and post method.. pass in a form with all details on
		return null;
	}

	@Override
	public int retrieveAvailableAdultBikeCount() {
		return bikeDAO.retrieveAvailableAdultBikeCount();
	}

	@Override
	public int retrieveAvailableChildBikeCount() {
		// TODO Auto-generated method stub
		return 0;
	}
}