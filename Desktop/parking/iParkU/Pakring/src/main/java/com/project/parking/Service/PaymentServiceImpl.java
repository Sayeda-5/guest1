package com.project.parking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.parking.Exception.PaymentException;
import com.project.parking.Model.Booking;
import com.project.parking.Model.BookingStatus;
import com.project.parking.Model.Payment;
import com.project.parking.Model.PaymentDTO;
import com.project.parking.Model.PaymentStatus;
import com.project.parking.Model.Session;
import com.project.parking.Repository.BookingDAO;
import com.project.parking.Repository.PaymentDAO;




@Service
public class PaymentServiceImpl implements PaymentService{

	@Override
	public Payment makePayment(PaymentDTO payment, Session session) throws PaymentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> viewAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment getPaymentById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



}
