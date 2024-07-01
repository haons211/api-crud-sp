package com.usercrud.usercrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long product_id;
    private String name;
    private String description;
    private Double price;
    private Long quantity;
    private Date timestamp;

    public Products() {
    }

    public Products(Long product_id, String name, String description, Double price, Long quantity, Date timestamp) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.timestamp = timestamp;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
