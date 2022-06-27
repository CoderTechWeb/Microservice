package com.suresh.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.order.model.Customer;
import com.suresh.order.model.CustomerOrder;
import com.suresh.order.respository.CustomerOrderRepository;

@RestController
public class OrderController {
	@Autowired
	private CustomerOrderRepository customerOrderRepo;
	
	@PostMapping("/myOrder")
	public List<CustomerOrder> getProductDetails(@RequestBody Customer customer) {
		List<CustomerOrder> customerOrder= customerOrderRepo.findAllByCustomerId(customer.getCustomerId());
		if(customerOrder!=null) {
			return customerOrder;
		} else {
			return null;
		}
	}
}
