package com.project.parking.Model;


import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	
	@NotBlank(message = "description cannot be null")
	private String description;
	
	@NotBlank(message = "bookingTitle cannot be null")
	private String bookingTitle;
	
	private LocalDateTime bookingDate;

	private Double totalCost;


	private BookingStatus bookingStatus = BookingStatus.PAYMENT_PENDING;
	
	

	@ManyToOne
	@JoinColumn(name = "customerId" )
	@NotNull(message = "customer cannot be null")
	@JsonIgnore
	private Customer customer;

	

	@OneToOne
	@PrimaryKeyJoinColumn
	@NotNull
	@JsonIgnore
	private TicketDetails ticket;



	public int getBookingId() {
		return bookingId;
	}



	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getBookingTitle() {
		return bookingTitle;
	}



	public void setBookingTitle(String bookingTitle) {
		this.bookingTitle = bookingTitle;
	}



	public LocalDateTime getBookingDate() {
		return bookingDate;
	}



	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}



	public Double getTotalCost() {
		return totalCost;
	}



	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}



	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}



	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public TicketDetails getTicket() {
		return ticket;
	}



	public void setTicket(TicketDetails ticket) {
		this.ticket = ticket;
	}



	

	

	
	
	
	
	
}

