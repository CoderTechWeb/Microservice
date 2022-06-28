package com.suresh.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.cart.model.Cart;
import com.suresh.cart.model.Customer;
import com.suresh.cart.repository.CartRepository;

@RestController
public class CartController {

	@Autowired
	private CartRepository cartsRepository;
	
	@PostMapping("/myCart")
	public List<Cart> getAccountDetails(@RequestBody Customer customer) {
		List<Cart> carts = cartsRepository.findByCustomerId(customer.getCustomerId());
		if(carts!=null) {
			return carts;
		} else {
			return null;
		}
	}
}
