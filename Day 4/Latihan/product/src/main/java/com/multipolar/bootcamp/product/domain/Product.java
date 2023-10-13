package com.multipolar.bootcamp.product.config;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document

public class Product implements Serializable {
    @Id
    private String id;
    private String productName;
    private String productType;
}
