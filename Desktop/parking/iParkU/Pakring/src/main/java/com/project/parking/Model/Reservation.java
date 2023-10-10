package com.project.parking.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Reservation {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @ManyToOne
	    @JoinColumn(name = "customer_id", nullable = false)
	    private Customer customer;
	    
	    @ManyToOne
	    @JoinColumn(name = "vehicle_id", nullable = false)
	    private Vehicle vehicle;
	    
	    @ManyToOne
	    @JoinColumn(name = "parking_space_id", nullable = false)
	    private ParkingSpace parkingSpace;
	    
	    @Column(nullable = false)
	    private LocalDateTime reservationDateTime;
	    
	    @Column(nullable = false)
	    private LocalDateTime expirationDateTime;
	    
	    @Enumerated(EnumType.STRING)
	    private ReservationStatus status;
}
