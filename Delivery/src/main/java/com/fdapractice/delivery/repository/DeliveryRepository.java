package com.fdapractice.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.fdapractice.delivery.entity.DeliveryEntity;

public interface DeliveryRepository extends JpaRepository<DeliveryEntity,Integer> {

}
