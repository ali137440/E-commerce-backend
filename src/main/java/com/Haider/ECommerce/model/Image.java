package com.Haider.ECommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Image {
    @Id
    private String id;
    private String imageName;
    private byte[] imageData;

    public void setData(byte[] bytes) {

    }
}
