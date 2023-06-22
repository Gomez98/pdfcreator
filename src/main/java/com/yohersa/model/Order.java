package com.yohersa.model;

import com.yohersa.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document
@AllArgsConstructor
public class Order {
    @MongoId
    String id;
    @Field
    String productName;
    @Field
    Double amount;
    @Field
    Status status;
}
