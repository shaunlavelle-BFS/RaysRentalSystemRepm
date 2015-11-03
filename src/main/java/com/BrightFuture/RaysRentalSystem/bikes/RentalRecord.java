package com.BrightFuture.RaysRentalSystem.bikes;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

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

import com.BrightFuture.RaysRentalSystem.customer.Customer;

@Entity
@Proxy(lazy = false)
@Table(name = "rental_records")
public class RentalRecord {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="rent_date")
	private Date rentDate;
	
	@Column(name="time_out")
	private Timestamp timeOut;
	
	@Column(name="return_time_due")
	private Timestamp returnTimeDue;
	
	@Column(name="return_time_actual")
	private Timestamp returnTimeActual;
	
	@Column(name="amount_paid")
	private BigDecimal amountPaid;
	
	@ManyToOne()
	@JoinColumn(name="bike_id", foreignKey=@ForeignKey(name="rental_record_bike_id_fkey"))
	private Bike bike;
	
	@ManyToOne()
	@JoinColumn(name="customer_id", foreignKey=@ForeignKey(name="rental_record_customer_id_fkey"))
	private Customer customer;

	public Long getId() {
		return id;
	}

	public Date getRentDate() {
		return rentDate;
	}

	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}

	public Timestamp getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Timestamp timeOut) {
		this.timeOut = timeOut;
	}

	public Timestamp getReturnTimeDue() {
		return returnTimeDue;
	}

	public void setReturnTimeDue(Timestamp returnTimeDue) {
		this.returnTimeDue = returnTimeDue;
	}

	public Timestamp getReturnTimeActual() {
		return returnTimeActual;
	}

	public void setReturnTimeActual(Timestamp returnTimeActual) {
		this.returnTimeActual = returnTimeActual;
	}

	public BigDecimal getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(BigDecimal amountPaid) {
		this.amountPaid = amountPaid;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}