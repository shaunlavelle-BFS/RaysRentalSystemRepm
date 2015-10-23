package com.BrightFuture.RaysRentalSystem.maintenance;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.BrightFuture.RaysRentalSystem.bikes.Bike;

@Entity
@Proxy(lazy = false)
@Table(name = "maintenance_records")
public class MaintenanceRecord {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="fault_details")
	private String faultDetails;
	
	@Column(name="fault_date")
	private Date faultDate;
	
	@Column(name="action_taken")
	private String actionTaken;
	
	@Column(name="action_date")
	private Date actionDate;
	
	@ManyToOne()
	@JoinColumn(name="bike_id", foreignKey=@ForeignKey(name="maintenance_record_bike_id_fkey"))
	private Bike bike;
	
	public Long getId() {
		return id;
	}

	public String getFaultDetails() {
		return faultDetails;
	}

	public void setFaultDetails(String faultDetails) {
		this.faultDetails = faultDetails;
	}

	public Date getFaultDate() {
		return faultDate;
	}

	public void setFaultDate(Date faultDate) {
		this.faultDate = faultDate;
	}

	public String getActionTaken() {
		return actionTaken;
	}

	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}

	public Date getActionDate() {
		return actionDate;
	}

	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}
}