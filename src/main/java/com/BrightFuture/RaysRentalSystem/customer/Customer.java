package com.BrightFuture.RaysRentalSystem.customer;

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
import com.BrightFuture.RaysRentalSystem.rent.RentalRecord;

/**
 * @author slavelle
 *
 */
@Entity
@Proxy(lazy = false)
@Table(name = "customer")
	
public class Customer {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="surname")
	private String surname;
		
	@Column(name="telephone")
	private String telephone;

	@OneToOne
	@JoinColumn(name="address_id", foreignKey=@ForeignKey(name="customer_address_fk"))
	private Address address;
	
	@OneToMany(mappedBy="customer")
	private List<RentalRecord> rentalRecords = new ArrayList<RentalRecord>();

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<RentalRecord> getRentalRecords() {
		return rentalRecords;
	}

	public void setRentalRecords(List<RentalRecord> rentalRecords) {
		this.rentalRecords = rentalRecords;
	}
}