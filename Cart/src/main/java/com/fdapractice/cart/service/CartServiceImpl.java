package com.fdapractice.cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fdapractice.cart.entity.CartEntity;
import com.fdapractice.cart.repositoy.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRepo;
 
	@Override
	public CartEntity addToCart(CartEntity cart) {
		return cartRepo.save(cart);
	}
 
	@Override
	public CartEntity updateCart(CartEntity cart) {
		return cartRepo.save(cart);
	}
 
	@Override
	public List<CartEntity> viewAllCart() {
		return cartRepo.findAll();
	}
 
	@Override
	public void deleteCartById(int cId) {
 
		cartRepo.deleteById(cId);
	}
 

}
