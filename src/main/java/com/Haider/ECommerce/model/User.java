package com.Haider.ECommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @Id
    private String id;
    private String name;
    private String userName;
    private String mobileNo;
    private String emailId;
    private String address;
    private String password;
    private String profileImage;


}
