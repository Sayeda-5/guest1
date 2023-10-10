package com.project.parking.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.parking.Model.Booking;



public interface BookingDAO extends JpaRepository<Booking, Integer>{

}
