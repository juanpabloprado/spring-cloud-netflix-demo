package com.juanpabloprado.productservice.domain;

import com.juanpabloprado.productservice.core.AuditingEntity;

import javax.persistence.Entity;

@Entity
public class Product extends AuditingEntity {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
