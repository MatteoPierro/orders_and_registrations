package io.vocidelcodice.orders_and_registrations;

import java.util.Map;
import java.util.UUID;

public class InMemoryOrderRepository implements OrderRepository {

    private final Map<UUID, OrderRecord> records;

    public InMemoryOrderRepository(Map<UUID, OrderRecord> records) {
        this.records = records;
    }

    @Override
    public void save(Order order) {
        records.put(order.id(), new OrderRecord(order.id(), order.conferenceId(), order.seats()));
    }

    record OrderRecord(UUID id, UUID conferenceId, Integer seats) {
    }
}
