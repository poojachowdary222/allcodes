package com.fdapractice.menu.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "menu")
public class MenuEntity {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
private String name;
private float price;
private String category;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public MenuEntity() {
	super();
	
}
public MenuEntity(int id, String name, float price, String category) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.category = category;
}
@Override
public String toString() {
	return "MenuEntity [name=" + name + ", price=" + price + ", category=" + category + "]";
}


}
