package com.project.parking.Model;




import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class TicketDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ticketdetails_Id ;
	
	@ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "parking_space_id", nullable = false)
    private ParkingSpace parkingSpace;

    @Column(nullable = false)
    private LocalDateTime issueDateTime;

    private double fineAmount;
	    

}