package com.kodilla.good.patterns.challenges.allegro;

public class InformationService {
    public InformationService() {
    }

    public boolean inform(BuyNow buyNow) {
        System.out.println("Ordered for: " + buyNow.getUser().getName() + " " + buyNow.getUser().getSurname() + " thing: " + buyNow.getThing() + " price: " + buyNow.getPrice());
        return true;
    }
}
