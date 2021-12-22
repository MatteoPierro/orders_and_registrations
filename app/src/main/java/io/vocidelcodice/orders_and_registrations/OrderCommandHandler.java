package io.vocidelcodice.orders_and_registrations;

public class OrderCommandHandler {
    private final OrderRepository orderRepository;
    private final EventBus eventBus;

    public OrderCommandHandler(OrderRepository orderRepository, EventBus eventBus) {
        this.orderRepository = orderRepository;
        this.eventBus = eventBus;
    }

    public void handle(RegisterToConferenceCommand command) {
        Order order = Order.place(command.orderId(), command.conferenceId(), command.numberOfSeats());
        orderRepository.save(order);
        eventBus.publish(order.changes());
    }

}
