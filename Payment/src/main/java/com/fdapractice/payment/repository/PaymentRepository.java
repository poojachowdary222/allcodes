package com.fdapractice.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdapractice.payment.entity.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Integer> {

}
