package com.fdapractice.payment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fdapractice.payment.entity.PaymentEntity;

@Service
public interface PaymentService {

	public PaymentEntity addToPayment(PaymentEntity payment);
	public PaymentEntity updatePayment(PaymentEntity payment);
	public List<PaymentEntity> viewAllPayment();
	public void deletePaymentById(int id);
	public void deletePaymentsByCartId(int cartId);
	
}
