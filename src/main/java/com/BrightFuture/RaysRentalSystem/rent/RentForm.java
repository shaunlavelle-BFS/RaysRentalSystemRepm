package com.BrightFuture.RaysRentalSystem.rent;

import java.sql.Date;

import com.BrightFuture.RaysRentalSystem.constants.RentDuration;
import com.BrightFuture.RaysRentalSystem.customer.Customer;

/**
 * @author slavelle
 *
 */
public class RentForm {
	
	public static Integer maleStandard;
	
	public static Integer maleLarge;
	
	public static  Integer femaleStandard;
	
	public static Integer femaleLarge;
	
	public static Integer child;
	
	public static Customer customer;
	
	public static Date rentDate;
	
	public static RentDuration rentDuration;
	
	public static Integer amountPaid;
	
	public  Integer getMaleStandard() {
		return maleStandard;
	}

	public void setMaleStandard(Integer maleStandard) {
		RentForm.maleStandard = maleStandard;
	}

	public  Integer getMaleLarge() {
		return maleLarge;
	}

	public void setMaleLarge(Integer maleLarge) {
		RentForm.maleLarge = maleLarge;
	}

	public  Integer getFemaleStandard() {
		return femaleStandard;
	}

	public void setFemaleStandard(Integer femaleStandard) {
		RentForm.femaleStandard = femaleStandard;
	}

	public  Integer getFemaleLarge() {
		return femaleLarge;
	}

	public void setFemaleLarge(Integer femaleLarge) {
		RentForm.femaleLarge = femaleLarge;
	}

	public  Integer getChild() {
		return child;
	}

	public void setChild(Integer child) {
		RentForm.child = child;
	}

	public  Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		RentForm.customer = customer;
	}

	public  Date getRentDate() {
		return rentDate;
	}

	public void setRentDate(Date rentDate) {
		RentForm.rentDate = rentDate;
	}

	public RentDuration getRentDuration() {
		return rentDuration;
	}

	public static void setRentDuration(RentDuration rentDuration) {
		RentForm.rentDuration = rentDuration;
	}

	public  Integer getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Integer amountPaid) {
		RentForm.amountPaid = amountPaid;
	}
}