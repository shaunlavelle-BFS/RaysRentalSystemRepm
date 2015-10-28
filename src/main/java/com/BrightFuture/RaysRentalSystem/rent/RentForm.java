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
	
	public static Address address;
	
	public static List<Bike> bikes; 
	
	public static BigDecimal amountPaid;
	
	public static Date rentDate;
	
	public static Time timeOut;
	
	public static Timestamp returnTimeDue;
	
	public static Timestamp returnTimeActual;
}