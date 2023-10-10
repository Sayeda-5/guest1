package com.project.parking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.parking.Model.Payment;

public interface PaymentDAO extends JpaRepository<Payment, Integer>{

}
