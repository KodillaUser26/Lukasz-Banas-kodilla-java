package com.kodilla.good.patterns.challenges.food2door;

public class OrderRespository {
    public OrderRespository() {
    }

    public boolean createOrder(String nameFirm, String product, double quantity) {
        System.out.println("Producent: " + nameFirm + ", order: " + product + ", getQuantity: " + quantity);
        return true;
    }
}
