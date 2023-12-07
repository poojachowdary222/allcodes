package com.fdapractice.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fdapractice.payment.entity.PaymentEntity;
import com.fdapractice.payment.service.PaymentService;

@RestController
@RequestMapping ("/payment")
public class PaymentController {

	
	@Autowired
	private PaymentService paymentservice;
	
	@PostMapping ("/add")
	public PaymentEntity addPayment (@RequestBody PaymentEntity payment) {
		return paymentservice.addToPayment(payment);
	}
	
	@PutMapping ("/update")
	public PaymentEntity upadtePayment (@RequestBody PaymentEntity payment) {
		return paymentservice.updatePayment(payment);
	}
	
	@DeleteMapping ("/delete/{id}")
	public String deletePayment (@PathVariable int id) {
		paymentservice.deletePaymentById(id);
		return "deletedId=" + id + "data";
		
	}
	
	@DeleteMapping ("/delete/{cartId}")
	public String deletePayments   (@PathVariable int cartId) {
		paymentservice.deletePaymentById(cartId);
		return "deletedPaymentId=" + cartId + "data";
		
	}
	
}
