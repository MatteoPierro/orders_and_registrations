package io.vocidelcodice.orders_and_registrations;

public class OrderCommandHandler {
    private final OrderRepository orderRepository;

    public OrderCommandHandler(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void handle(RegisterToConferenceCommand command) {
        orderRepository.save(new Order());
    }
}
