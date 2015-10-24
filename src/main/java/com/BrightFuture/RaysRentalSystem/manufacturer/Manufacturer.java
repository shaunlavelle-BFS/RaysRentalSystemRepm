package com.BrightFuture.RaysRentalSystem.manufacturer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.BrightFuture.RaysRentalSystem.address.Address;
import com.BrightFuture.RaysRentalSystem.bikes.Bike;

@Entity
@Proxy(lazy = false)
@Table(name = "manufacturer")
public class Manufacturer {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy="manufacturer")
	private List<Bike> bikes = new ArrayList<Bike>();
	
	@Column(name="name")
	private String name;

	@Column(name="telephone")
	private String telephone;
	
	@OneToOne
	@JoinColumn(name="address_id", foreignKey=@ForeignKey(name="manufacturer_address_fk"))
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

	public List<Bike> getBikes() {
		return bikes;
	}

	public void setBikes(List<Bike> bikes) {
		this.bikes = bikes;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}