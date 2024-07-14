package com.Haider.ECommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Category {
    @Id
    private String categoryId;
    private String categoryName;
    private String categoryImage;

}
