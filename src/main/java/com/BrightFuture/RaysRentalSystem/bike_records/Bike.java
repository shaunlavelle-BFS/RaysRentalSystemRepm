package com.BrightFuture.RaysRentalSystem.bike_records;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Bike {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
/*	@OneToMany(mappedBy="bike", cascade=CascadeType.ALL)
	@Fetch (FetchMode.SELECT)
	private List<BikeRecords> bikeRecords = new ArrayList<BikeRecords>();*/
	
	@Column(name="make", nullable=false)
	private String make;
	
	@Column(name="model", nullable=false)
	private String model;
}
