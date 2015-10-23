package com.BrightFuture.RaysRentalSystem.bikes;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.BrightFuture.RaysRentalSystem.constants.Classification;
import com.BrightFuture.RaysRentalSystem.constants.Gender;
import com.BrightFuture.RaysRentalSystem.constants.Size;
import com.BrightFuture.RaysRentalSystem.maintenance.MaintenanceRecord;
import com.BrightFuture.RaysRentalSystem.manufacturer.Manufacturer;

@Entity
@Proxy(lazy = false)
@Table(name = "bikes")
public class Bike {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="bike_number")
	private Long bikeNumber;
	
	@Column(name="model")
	private String model;
		
	@ManyToOne()
	@JoinColumn(name="manufacturer_id", foreignKey=@ForeignKey(name="bike_manufacturer_id_fkey"))
	private Manufacturer manufacturer;
	
	@Column(name="purchase_date")
	private Date purchaseDate;

	@Column(name="price")
	private BigDecimal price;
	
	@Enumerated(EnumType.STRING)
	private Size size;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Enumerated(EnumType.STRING)
	private Classification classification;
	
	@OneToOne(mappedBy="bike")
	private DisposalDetails disposalDetails;
	
	@OneToMany(mappedBy="bike")
	private List<MaintenanceRecord> maintenanceRecords = new ArrayList<MaintenanceRecord>();
	
	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	public DisposalDetails getDisposalDetails() {
		return disposalDetails;
	}

	public void setDisposalDetails(DisposalDetails disposalDetails) {
		this.disposalDetails = disposalDetails;
	}
	
	public Long getId() {
		return id;
	}

	public Long getBikeNumber() {
		return bikeNumber;
	}

	public void setBikeNumber(Long bikeNumber) {
		this.bikeNumber = bikeNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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