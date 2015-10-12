package com.BrightFuture.RaysRentalSystem.bikes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

/**
 * @author slavelle
 *
 */
@Entity
@Proxy(lazy = false)
@Table(name = "bikes")
public class Bike {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy="bike", cascade=CascadeType.ALL)
	private List<BikeRecord> bikeRecords = new ArrayList<BikeRecord>();
	
	@Column(name="brand", nullable=false)
	private String brand;
	
	@Column(name="model", nullable=false)
	private String model;

	public Long getId() {
		return id;
	}

	public List<BikeRecord> getBikeRecords() {
		return bikeRecords;
	}

	public void setBikeRecords(List<BikeRecord> bikeRecords) {
		this.bikeRecords = bikeRecords;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
