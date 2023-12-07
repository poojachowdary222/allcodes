package com.fdapractice.admin.repository;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Repository extends JpaRepository<Admin,Integer> {

	

}
