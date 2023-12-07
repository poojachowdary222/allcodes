package com.fdapractice.cart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "Cart")

public class CartEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String itemName;
	private float totalPrice;
	private int quantity;

	public CartEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartEntity(int id, String itemName, float totalPrice, int quantity) {
		super();
		this.itemName = itemName;
		this.totalPrice = totalPrice;
		this.quantity = quantity;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartEntity [itemName=" + itemName + ", totalPrice=" + totalPrice + ", quantity=" + quantity + "]";
	}


}
