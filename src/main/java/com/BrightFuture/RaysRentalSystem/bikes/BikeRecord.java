package com.BrightFuture.RaysRentalSystem.bikes;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy = false)
@Table(name = "bike_records")
public class BikeRecord {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="bike_id", nullable=false, updatable=false, foreignKey=@ForeignKey(name="bike_record_bike_id_fkey"))
	private Bike bike;

	public Long getId() {
		return id;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}
	
	/*@Column
	Status status;*/
	
}