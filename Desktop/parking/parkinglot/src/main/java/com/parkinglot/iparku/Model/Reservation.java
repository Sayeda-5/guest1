package com.parkinglot.iparku.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Reservation {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @ManyToOne
	    @JoinColumn(name = "user_id", nullable = false)
	    private User user;
	    
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
