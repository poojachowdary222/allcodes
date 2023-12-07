package com.fdapractice.cart.controller;

import org.springframework.web.bind.annotation.RestController;

import com.fdapractice.cart.entity.CartEntity;
import com.fdapractice.cart.service.CartService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

	
	@Autowired
	private CartService cartservice;
	
	@PostMapping("/add")
	public CartEntity addCart(@RequestBody CartEntity cart) {
		return cartservice.addToCart(cart);
		
	}
	@PutMapping ("/update")
	public CartEntity updateCart(@RequestBody CartEntity cart) {
		return cartservice.updateCart(cart);
	}
	@DeleteMapping ("/delete/{cId}")
	public String deleteCart(@PathVariable int cId) {
		 cartservice.deleteCartById(cId);
		 return "deletedId = " + cId+ "data";
	}
	@GetMapping("/viewAllCart") 
	public List<CartEntity> viewAllCart() {
 
		return cartservice.viewAllCart();
	}
		
	}

