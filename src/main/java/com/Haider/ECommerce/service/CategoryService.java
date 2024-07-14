package com.Haider.ECommerce.service;

import com.Haider.ECommerce.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryService extends MongoRepository<Category,String> {
    Category findBycategoryName(String name);
}
