package com.parkinglot.iparku.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parkinglot.iparku.Model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Add custom queries or methods if needed
}
