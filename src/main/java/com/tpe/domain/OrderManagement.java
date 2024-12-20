package com.tpe.domain;

import java.util.Date;
import java.util.Map;

public class OrderManagement {


    private int id;
    private int userId;
    private Map<Integer, Integer> products; // Product ID -> Quantity
    private Date date;
    private Status status;

    public enum Status {
        PREPARING, SHIPPED, DELIVERED
    }

    // Constructor
    public OrderManagement(int id, int userId, Map<Integer, Integer> products, Date date, Status status) {
        this.id = id;
        this.userId = userId;
        this.products = products;
        this.date = date;
        this.status = status;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Map<Integer, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Integer> products) {
        this.products = products;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}