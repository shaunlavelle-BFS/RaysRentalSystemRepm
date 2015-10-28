package com.BrightFuture.RaysRentalSystem.rent;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class RentServiceImpl implements RentService {

	@Override
	public void rentBike(RentForm rentForm) {
		/*RentalRecord rentalRecord = new RentalRecord();
		rentalRecord.setCustomerAddress(rentForm.getAddress());
		rentalRecord.setAmountPaid(rentalForm.);*/
	}
}