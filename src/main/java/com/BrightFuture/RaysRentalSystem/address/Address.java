package com.BrightFuture.RaysRentalSystem.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.BrightFuture.RaysRentalSystem.bikes.DisposalDetails;
import com.BrightFuture.RaysRentalSystem.customer.Customer;
import com.BrightFuture.RaysRentalSystem.manufacturer.Manufacturer;

@Entity
@Proxy(lazy = false)
@Table(name = "address")
public class Address {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="address_line1")
	private String addressLine1;
	
	@Column(name="address_line2")
	private String addressLine2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="county")
	private String county;
	
	@Column(name="postcode")
	private String postcode;
	
	@OneToOne(mappedBy="address")
	private DisposalDetails disposalDetails;
	
	@OneToOne(mappedBy="address")
	private Manufacturer manufacturer;
	
	@OneToOne(mappedBy="address")
	private Customer customer;

	public Long getId() {
		return id;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public DisposalDetails getDisposalDetails() {
		return disposalDetails;
	}

	public void setDisposalDetails(DisposalDetails disposalDetails) {
		this.disposalDetails = disposalDetails;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
}