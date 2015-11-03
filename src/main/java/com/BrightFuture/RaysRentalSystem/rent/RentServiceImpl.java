package com.BrightFuture.RaysRentalSystem.rent;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BrightFuture.RaysRentalSystem.address.AddressDAO;
import com.BrightFuture.RaysRentalSystem.bikes.Bike;
import com.BrightFuture.RaysRentalSystem.bikes.BikeDAO;
import com.BrightFuture.RaysRentalSystem.bikes.RentalRecord;
import com.BrightFuture.RaysRentalSystem.constants.BikeSize;
import com.BrightFuture.RaysRentalSystem.customer.CustomerDAO;

@Service
@Transactional
public class RentServiceImpl implements RentService {

	@Autowired
	BikeDAO bikeDAO;
	
	@Autowired
	RentDAO rentDAO;
	
	@Autowired
	CustomerDAO customerDAO;
	
	@Autowired
	AddressDAO addressDAO;
	
	@Override
	public void rentBikes(RentForm rentForm) {
		List<Bike> bikesToRent = new ArrayList<Bike>();
		if(null != rentForm.getMaleLarge() || rentForm.getMaleLarge() != 0)
		{
			List<Bike> largeMaleBikes = bikeDAO.retrieveAvailableBikes(BikeSize.LARGE_MALE, true).subList(0, rentForm.getMaleLarge());
			bikesToRent.addAll(largeMaleBikes);
		}
		if(null != rentForm.getMaleStandard() || rentForm.getMaleStandard() != 0)
		{
			List<Bike> standardMaleBikes = bikeDAO.retrieveAvailableBikes(BikeSize.STANDARD_MALE, true).subList(0, rentForm.getMaleStandard());
			bikesToRent.addAll(standardMaleBikes);
		}
		if(null != rentForm.getFemaleLarge() || rentForm.getFemaleLarge() != 0)
		{
			List<Bike> largeFemaleBikes = bikeDAO.retrieveAvailableBikes(BikeSize.LARGE_FEMALE, true).subList(0, rentForm.getFemaleLarge());
			bikesToRent.addAll(largeFemaleBikes);
		}
		if(null != rentForm.getFemaleStandard() || rentForm.getFemaleStandard() != 0)
		{
			List<Bike> standardFemaleBikes = bikeDAO.retrieveAvailableBikes(BikeSize.STANDARD_FEMALE, true).subList(0, rentForm.getFemaleStandard());
			bikesToRent.addAll(standardFemaleBikes);
		}
		if(null != rentForm.getChild() || rentForm.getChild() != 0)
		{
			List<Bike> childBikes = bikeDAO.retrieveAvailableBikes(BikeSize.CHILD, true).subList(0, rentForm.getChild());
			bikesToRent.addAll(childBikes);
		}
		
		addressDAO.save(rentForm.getCustomer().getAddress());
		customerDAO.save(rentForm.getCustomer());
		
		for (Bike bike : bikesToRent) {
			bike.setAvailable(false);
			bikeDAO.save(bike);
			RentalRecord rentalRecord = new RentalRecord();
			rentalRecord.setCustomer(rentForm.getCustomer());
			rentalRecord.setBike(bike);
			//rentalRecord.setTimeOut(rentForm.getTimeOut());
			//rentalRecord.setReturnTimeDue(rentForm.getReturnTimeDue());
			rentalRecord.setRentDate(rentForm.getRentDate());
			//rentalRecord.setAmountPaid(rentForm.getAmountPaid());
			
			rentDAO.save(rentalRecord);
		}
	}
}