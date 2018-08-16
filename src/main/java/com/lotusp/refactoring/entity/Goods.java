package com.lotusp.refactoring.entity;

public class Goods {

    private String name;

    private double price;

    private int quantity;

    public Goods(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getDiscountedPrice() {
        double basePrice = price * quantity;
        int discountLevel = quantity > 100 ? 2 : 1;
        return discountedPrice(basePrice, discountLevel);
    }

    private double discountedPrice(double basePrice, int discountLevel) {
        return basePrice * (1 - 0.05 * discountLevel);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
