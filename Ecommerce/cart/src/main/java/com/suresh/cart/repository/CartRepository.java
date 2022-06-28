package com.suresh.cart.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.suresh.cart.model.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {

	List<Cart> findByCustomerId(int customerId);

}
