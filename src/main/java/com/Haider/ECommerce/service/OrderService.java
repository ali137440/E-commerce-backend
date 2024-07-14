package com.Haider.ECommerce.service;

import com.Haider.ECommerce.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderService extends MongoRepository<Order,String> {
}
