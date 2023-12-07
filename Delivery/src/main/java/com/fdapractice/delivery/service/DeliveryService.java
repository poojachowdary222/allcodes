package com.fdapractice.delivery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fdapractice.delivery.entity.DeliveryEntity;


@Service
public interface DeliveryService  {
	public DeliveryEntity addToDelivery(DeliveryEntity delivery);
	public DeliveryEntity updateDelivery(DeliveryEntity delivery);
	public List<DeliveryEntity> viewAllDelivery();
    public void deleteDeliveryByCId(int CId);
    public void deleteDeliveryByDId(int DId);
    
    
    
    
    
    
    
    
}
