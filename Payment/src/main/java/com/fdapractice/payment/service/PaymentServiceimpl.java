package com.fdapractice.payment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdapractice.payment.entity.PaymentEntity;
import com.fdapractice.payment.repository.PaymentRepository;
@Service
public class PaymentServiceimpl implements PaymentService{
	@Autowired
	PaymentRepository paymentRepo;

	@Override
	public PaymentEntity addToPayment(PaymentEntity payment) {
		return paymentRepo.save(payment);
	}

	@Override
	public PaymentEntity updatePayment(PaymentEntity payment) {
		return paymentRepo.save(payment);
	}

	@Override
	public List<PaymentEntity> viewAllPayment() {
		return paymentRepo.findAll();
	}

	@Override
	public void deletePaymentById(int id) {
		paymentRepo.deleteById(id);
	}

	@Override
	public void deletePaymentsByCartId(int cartId) {
		paymentRepo.deleteById(cartId);
	}
}
