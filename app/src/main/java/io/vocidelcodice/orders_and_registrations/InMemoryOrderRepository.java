package io.vocidelcodice.orders_and_registrations;

import java.util.HashMap;
import java.util.UUID;

public class InMemoryOrderRepository implements OrderRepository {

    private final HashMap<UUID, OrderRecord> records;

    public InMemoryOrderRepository(HashMap<UUID, OrderRecord> records) {
        this.records = records;
    }

    @Override
    public void save(Order order) {
        records.put(order.id(), new OrderRecord(order.id(), order.conferenceId(), order.seats()));
    }

    record OrderRecord(UUID id, UUID conferenceId, Integer seats) {
    }
}
