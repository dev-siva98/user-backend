package com.moz.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "user")
public class UserDao {
    @Id
    private String _id;
    private String name;
    private String gender;
    private int classVal;
    private String division;
    private String dob;
}
