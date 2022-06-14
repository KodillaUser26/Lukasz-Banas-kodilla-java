package com.kodilla.good.patterns.challenges.food2door;

public class LoadOrder {
    public LoadOrder() {
    }

    public Producent load(String product, double quantity) {
        if (quantity < 10.00) {
            return new ExtraFoodShop(product, quantity);
        } else {
            return quantity >= 10.00 && quantity < 15.00 ? new HealthyShop(product, quantity) : new GlutenFreeShop(product, quantity);
        }
    }
}
