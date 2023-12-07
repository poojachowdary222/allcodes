package com.fdapractice.delivery.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "delivery")

public class DeliveryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int cId;
	private int dId;
	private String status;
	public DeliveryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public DeliveryEntity(int cId, int dId, String status) {
		super();
		this.cId = cId;
		this.dId = dId;
		this.status = status;
	}
	@Override
	public String toString() {
		return "DeliveryEntity [cId=" + cId + ", status=" + status + "]";
	}
	
}
