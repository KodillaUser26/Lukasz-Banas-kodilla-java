package com.kodilla.good.patterns.challenges.allegro;

public class OrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, ProductOrderService productOrderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
    }

    public BuyDto process(BuyNow buyNow) {
        boolean isBuyed = this.productOrderService.sell(buyNow);
        if (isBuyed) {
            this.informationService.inform(buyNow);
            this.orderRepository.createOrder(buyNow);
            return new BuyDto(buyNow.getUser(), true);
        } else {
            return new BuyDto(buyNow.getUser(), false);
        }
    }
}
