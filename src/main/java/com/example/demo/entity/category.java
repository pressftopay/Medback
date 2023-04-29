package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class category {
    @Id
    private Long id;
    private String c_name;
    private String quantity;

    public category(Long id, String c_name, String quantity) {
        this.id = id;
        this.c_name = c_name;
        this.quantity = quantity;
    }

    public category() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
