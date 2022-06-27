package com.suresh.order.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.suresh.order.model.CustomerOrder;

@Repository
public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, Long>{
	
	List<CustomerOrder> findAllByCustomerId(int customerId);
}
