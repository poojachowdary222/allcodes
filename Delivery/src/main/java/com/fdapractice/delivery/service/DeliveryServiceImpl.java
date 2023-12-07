package com.fdapractice.delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdapractice.delivery.entity.DeliveryEntity;
import com.fdapractice.delivery.repository.DeliveryRepository;
@Service
public class DeliveryServiceImpl implements DeliveryService {
@Autowired
DeliveryRepository deliveryRepo;
	@Override
	public DeliveryEntity addToDelivery(DeliveryEntity delivery) {
		return deliveryRepo.save(delivery);
	}

	@Override
	public DeliveryEntity updateDelivery(DeliveryEntity delivery) {
		return deliveryRepo.save(delivery);
	}

	@Override
	public List<DeliveryEntity> viewAllDelivery() {
		return deliveryRepo.findAll();
	}

	@Override
	public void deleteDeliveryByCId(int CId) {
		deliveryRepo.deleteById(CId);
		
	}

	@Override
	public void deleteDeliveryByDId(int DId) {
		deliveryRepo.deleteById(DId);
		
	}
}

