package com.BrightFuture.RaysRentalSystem.bikes;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BrightFuture.RaysRentalSystem.constants.Gender;
import com.BrightFuture.RaysRentalSystem.constants.Size;

@Service
@Transactional
public class BikeServiceImpl implements BikeService {

	@Autowired
	BikeDAO bikeDAO;
	
	@Override
	public Bike addNewBike(Bike bike) {
		bike.setBikeRecords(null);
		bike.setBrand("Giant");
		bike.setModel("x-5000");
		bike.setGender(Gender.MALE);
		bike.setSize(Size.Adults);
		bikeDAO.save(bike);
		return bike;
	}
}