package com.Haider.ECommerce.service;

import com.Haider.ECommerce.model.Image;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageService extends MongoRepository<Image,String> {
    Image findByImageName(String imageName);
}
