package com.yohersa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;


@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @MongoId
    String id;
    @Field
    int stock;
    @Field
    String sector;
    @Field
    String warehouse;
}
