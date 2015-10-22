package com.BrightFuture.RaysRentalSystem.bikes;

import java.util.ArrayList;
import java.util.List;

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
		List<BikeRecord> bikeRecords = new ArrayList<BikeRecord>();
		bike.setBikeRecords(bikeRecords);
		bike.setBrand("Giant");
		bike.setModel("x-5000");
		bike.setGender(Gender.MALE);
		bike.setSize(Size.LARGE);
		bikeDAO.persist(bike);
		return bike;
	}
}