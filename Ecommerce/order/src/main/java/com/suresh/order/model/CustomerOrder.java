package com.suresh.order.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class CustomerOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private int orderId;
	@Column(name = "customer_id")
	private int customerId;
	private String orderDate;
	@Column(name = "product_id")
	private String productId;
	@Column(name = "product_price")
	private String productPrice;

}
