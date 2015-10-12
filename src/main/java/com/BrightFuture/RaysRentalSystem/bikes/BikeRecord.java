package com.BrightFuture.RaysRentalSystem.bikes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.BrightFuture.RaysRentalSystem.constants.Size;
import com.BrightFuture.RaysRentalSystem.constants.Status;

@Entity
@Proxy(lazy = false)
@Table(name = "bike_records")
public class BikeRecord {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="bike_id", nullable=false, updatable=false, foreignKey=@ForeignKey(name="bike_record_bike_id_fkey"))
	private Bike bike;
	
	@Enumerated(EnumType.STRING)
	private Status status;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}
}