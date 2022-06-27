package com.suresh.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.product.model.Customer;
import com.suresh.product.model.Product;
import com.suresh.product.repository.ProductsRepository;

@RestController
public class ProductController {
	@Autowired
	private ProductsRepository productsRepository;
	
	@PostMapping("/myProduct")
	public List<Product> getProductDetails(@RequestBody Customer customer) {
		List<Product> products = productsRepository.findAllByCustomerId(customer.getCustomerId());
		if(products!=null) {
			return products;
		} else {
			return null;
		}
	}
}
