package com.project.parking.Service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.parking.Exception.PaymentException;
import com.project.parking.Model.Payment;
import com.project.parking.Model.PaymentDTO;
import com.project.parking.Model.Session;



@Repository
public interface PaymentService {

	public Payment makePayment(PaymentDTO payment, Session session) throws PaymentException;
    public Payment getPaymentById(Long id);
    public List<Payment> viewAllPayments();
}