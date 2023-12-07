package com.fdapractice.payment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "payment")
public class PaymentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int cartId;
	private float price;
	public PaymentEntity() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public PaymentEntity(int id, int cartId, float price) {
		super();
		this.id = id;
		this.cartId = cartId;
		this.price = price;
	}
	@Override
	public String toString() {
		return "PaymentEntity [cartId=" + cartId + ", price=" + price + "]";
	}
	
	
}
