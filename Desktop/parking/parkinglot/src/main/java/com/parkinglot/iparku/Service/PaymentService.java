package com.parkinglot.iparku.Service;

import java.util.List;

import com.parkinglot.iparku.Model.Payment;

public interface PaymentService {
	Payment makePayment(Payment payment);
    Payment getPaymentById(Long id);
    List<Payment> getAllPayments();
}
