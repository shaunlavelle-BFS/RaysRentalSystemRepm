package com.BrightFuture.RaysRentalSystem.rent;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import com.BrightFuture.RaysRentalSystem.address.Address;
import com.BrightFuture.RaysRentalSystem.bikes.Bike;
import com.BrightFuture.RaysRentalSystem.customer.Customer;

/**
 * @author slavelle
 *
 */
public class RentForm {
	
	public static Customer customer;
	
	public static List<Bike> bikes; 
	
	public static BigDecimal amountPaid;
	
	public static Date rentDate;
	
	public static Time timeOut;
	
	public static Timestamp returnTimeDue;
	
	public static Timestamp returnTimeActual;
	
	public static Customer getCustomer() {
		return customer;
	}

	public static void setCustomer(Customer customer) {
		RentForm.customer = customer;
	}

	public static List<Bike> getBikes() {
		return bikes;
	}

	public static void setBikes(List<Bike> bikes) {
		RentForm.bikes = bikes;
	}

	public static BigDecimal getAmountPaid() {
		return amountPaid;
	}

	public static void setAmountPaid(BigDecimal amountPaid) {
		RentForm.amountPaid = amountPaid;
	}

	public static Date getRentDate() {
		return rentDate;
	}

	public static void setRentDate(Date rentDate) {
		RentForm.rentDate = rentDate;
	}

	public static Time getTimeOut() {
		return timeOut;
	}

	public static void setTimeOut(Time timeOut) {
		RentForm.timeOut = timeOut;
	}

	public static Timestamp getReturnTimeDue() {
		return returnTimeDue;
	}

	public static void setReturnTimeDue(Timestamp returnTimeDue) {
		RentForm.returnTimeDue = returnTimeDue;
	}

	public static Timestamp getReturnTimeActual() {
		return returnTimeActual;
	}

	public static void setReturnTimeActual(Timestamp returnTimeActual) {
		RentForm.returnTimeActual = returnTimeActual;
	}
}