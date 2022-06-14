package com.kodilla.good.patterns.challenges.allegro;

public class BuyNowRetriever {
    public BuyNowRetriever() {
    }

    public BuyNow retrieve() {
        User user = new User("Robert", "Lewandowski");
        String thing = "something";
        int price = 50;
        return new BuyNow(user, thing, price);
    }
}
