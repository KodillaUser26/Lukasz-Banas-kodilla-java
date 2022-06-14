package com.kodilla.good.patterns.challenges.allegro;

public class BuyNow {
    public User user;
    public String thing;
    public int price;

    public BuyNow(User user, String thing, int price) {
        this.user = user;
        this.thing = thing;
        this.price = price;
    }

    public User getUser() {
        return this.user;
    }

    public String getThing() {
        return this.thing;
    }

    public int getPrice() {
        return this.price;
    }
}
