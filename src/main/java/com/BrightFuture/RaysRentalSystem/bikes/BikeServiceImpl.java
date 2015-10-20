package com.BrightFuture.RaysRentalSystem.bikes;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BrightFuture.lib.dao.CRUDDAO;
import com.BrightFuture.lib.service.CRUDService;

@Service
@Transactional
public class BikeServiceImpl implements BikeService {

	@Autowired
	private CRUDService crudService;
	
	@Autowired
	private CRUDDAO cruddao;
	
	@Override
	public Bike addNewBike(Bike bike) {
		
		return null;
	}

}
