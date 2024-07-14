package com.Haider.ECommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    @Id
    private String orderId;
    private List<Item> Item;


}
