package com.yohersa.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document
public class QRCode {
    @MongoId
    String id;
    @Field
    String sector;
    @Field
    String warehouse;
    @Field
    String productName;

    @Override
    public String toString() {
        return sector + "|" + warehouse +  "|" + productName;
    }
}
