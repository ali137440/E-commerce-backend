package com.Haider.ECommerce.service;

import com.Haider.ECommerce.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemService extends MongoRepository<Item,String> {
    List<Item> findByCategoryName(String name);

    List<Item> findByBrandName(String brand);
}
