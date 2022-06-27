package com.suresh.product.model;

import java.time.LocalDate;

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
public class Product {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "product_id")
		private String productId;
		@Column(name = "customer_id")
		private int customerId;
		@Column(name = "product_name")
		private String productName;
		@Column(name = "product_price")
		private String productPrice;
}
