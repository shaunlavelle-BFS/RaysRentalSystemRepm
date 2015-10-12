package com.BrightFuture.RaysRentalSystem.bikes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.BrightFuture.RaysRentalSystem.constants.Gender;
import com.BrightFuture.RaysRentalSystem.constants.Size;

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
	
	@Enumerated(EnumType.STRING)
	private Size size;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;

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
	
	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
