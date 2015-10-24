package com.BrightFuture.RaysRentalSystem.bikes;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.BrightFuture.RaysRentalSystem.address.Address;

@Entity
@Proxy(lazy = false)
@Table(name = "disposal_details")
public class DisposalDetails {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="dealer_name")
	private String dealerName;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="sale_price")
	private BigDecimal salePrice;
	
	@Column(name="sale_date")
	private Date saleDate;
	
	@OneToOne
	@JoinColumn(name="bike_id", foreignKey=@ForeignKey(name="disposal_details_bike_fk"))
	private Bike bike;
	
	@OneToOne
	@JoinColumn(name="address_id", foreignKey=@ForeignKey(name="disposal_details_address_fk"))
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}
}