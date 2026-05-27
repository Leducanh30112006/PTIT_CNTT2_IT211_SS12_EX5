package com.ra.ptit_cntt2_it211_ss12_ex5.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JacksonXmlRootElement(localName = "product")
public class Product {
    private static Long INDEX = 0L;
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, Double price, Integer quantity) {
        INDEX++;
        this.id = INDEX;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}