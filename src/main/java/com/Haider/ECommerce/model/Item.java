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
public class Item {
    @Id
    private String id;
    private String itemName;
    private String modelNo;
    private String brandName;
    private String categoryId;
    private String categoryName;
    private String description;
    private String specifications;
    private String Attributes;
    private String weightNunit;
    private String totalStocks;
    private String price;
    private String itemImage;


}
