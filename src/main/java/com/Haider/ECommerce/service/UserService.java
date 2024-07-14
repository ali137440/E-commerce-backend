package com.Haider.ECommerce.service;

import com.Haider.ECommerce.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService extends MongoRepository<User,String> {
    List<User> findByUserNameAndPassword(String userName, String password);
}
