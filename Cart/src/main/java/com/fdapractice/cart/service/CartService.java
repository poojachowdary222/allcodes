package com.fdapractice.cart.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fdapractice.cart.entity.CartEntity;

@Service
public interface CartService {

	public CartEntity addToCart(CartEntity cart);
	public CartEntity updateCart(CartEntity cart);
	public List<CartEntity> viewAllCart();
	public void deleteCartById(int cId);
	
}
