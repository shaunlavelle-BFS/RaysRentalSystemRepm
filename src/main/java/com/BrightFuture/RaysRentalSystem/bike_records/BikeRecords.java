package com.BrightFuture.RaysRentalSystem.bike_records;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BikeRecords {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	/*//one to one to bike table
	@OneToOne(cascade = {CascadeType.ALL}, mappedBy="order")
	private Bike bike;*/

}
