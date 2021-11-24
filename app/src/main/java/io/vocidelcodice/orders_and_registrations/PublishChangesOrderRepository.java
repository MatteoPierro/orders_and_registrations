package io.vocidelcodice.orders_and_registrations;

public class PublishChangesOrderRepository implements OrderRepository {
    private EventBus eventBus;

    public PublishChangesOrderRepository(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void save(Order order) {
        order.changes().forEach(eventBus::publish);
    }
}
