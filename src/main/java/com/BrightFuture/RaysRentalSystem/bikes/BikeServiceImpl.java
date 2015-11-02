package com.BrightFuture.RaysRentalSystem.bikes;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BrightFuture.RaysRentalSystem.constants.BikeSize;

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
	public int retrieveAvailableBikeCount(BikeSize bikeSize) {
		return bikeDAO.retrieveAvailableBikeCount(bikeSize);
	}
}