package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public Application() {
    }

    public static void main(String[] args) {
        LoadOrder loadOrder = new LoadOrder();
        Producent producent = loadOrder.load("Anna's coockie", 20.00);
        OrderFoodProcess orderFoodProcess = new OrderFoodProcess(new OrderRespository());
        orderFoodProcess.run(producent);
    }
}
