package com.fdapractice.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fdapractice.delivery.entity.DeliveryEntity;
import com.fdapractice.delivery.service.DeliveryService;

@RestController
@RequestMapping ("/delivery")
public class DeliveryController {

	@Autowired
	private DeliveryService deliveryservice;
	
	@PostMapping ("/add")
	public DeliveryEntity addDelivery (@RequestBody DeliveryEntity delivery) {
		return deliveryservice.addToDelivery(delivery);
	}
	
	@PutMapping ("/update")
	public DeliveryEntity updateDelivery (@RequestBody DeliveryEntity delivery) {
		return deliveryservice.updateDelivery(delivery);
	}
	
	
	@DeleteMapping ("/delete/{CId}")
	public String deleteDelivery (@PathVariable int CId) {
		deliveryservice.deleteDeliveryByCId(CId);
		return "deletedCartId=" + CId + "data";
		
	}
	
	@DeleteMapping ("/delete/{DId}")
	public String deleteDeliverys  (@PathVariable int DId) {
		deliveryservice.deleteDeliveryByDId(DId);
		return "deletedDeliveyId=" + DId + "data";
		
	}
	
	
}
