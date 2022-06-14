package com.kodilla.good.patterns.challenges.food2door;

class ExtraFoodShop implements Producent {
    private String product;
    private double quantity;

    public ExtraFoodShop(String product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return this.product;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public boolean process() {
        System.out.println("Order processed: " + this.product + ", " + this.quantity);
        return true;
    }
}
