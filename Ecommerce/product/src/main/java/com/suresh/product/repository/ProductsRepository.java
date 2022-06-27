package com.suresh.product.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.suresh.product.model.Product;

@Repository
public interface ProductsRepository extends CrudRepository<Product, Long>{

	List<Product> findAllByCustomerId(int customerId);

}
