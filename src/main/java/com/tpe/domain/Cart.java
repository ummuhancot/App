package com.tpe.domain;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private int userId;
    private Map<Integer, Integer> products; // Product ID -> Quantity

    public Cart(int userId) {
        this.userId = userId;
        this.products = new HashMap<>();
    }

    // Add product to cart
    public void addProduct(int productId, int quantity) {
        products.put(productId, products.getOrDefault(productId, 0) + quantity);
    }

    // Remove product from cart
    public void removeProduct(int productId) {
        products.remove(productId);
    }

    // Calculate total quantity in cart
    public int getTotalQuantity() {
        return products.values().stream().mapToInt(Integer::intValue).sum();
    }

    public Map<Integer, Integer> getProducts() {
        return products;
    }
}