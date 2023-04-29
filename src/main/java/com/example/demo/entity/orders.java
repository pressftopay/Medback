package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
public class orders {



    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String customer_Firstname;
    private String phone;
    private String address;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;
    private String time;
    private String optional;
    private String products;
    private String payment;
    private String delivery;
    private int totalcost;


    public orders() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomer_Firstname() {
        return customer_Firstname;
    }

    public void setCustomer_Firstname(String customer_Firstname) {
        this.customer_Firstname = customer_Firstname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public int getTotalCost() {
        return totalcost;
    }

    public void setTotalcost(int totalcost) {
        this.totalcost = totalcost;
    }

    public orders(Long id, String customer_Firstname, String phone, String address, Date date, String time, String optional, String products, String payment, String delivery, int totalCost) {
        this.id = id;
        this.customer_Firstname = customer_Firstname;
        this.phone = phone;
        this.address = address;
        this.date = date;
        this.time = time;
        this.optional = optional;
        this.products = products;
        this.payment = payment;
        this.delivery = delivery;
        this.totalcost = totalCost;
    }
}
