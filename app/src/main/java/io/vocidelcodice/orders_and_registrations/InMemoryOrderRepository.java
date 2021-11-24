package io.vocidelcodice.orders_and_registrations;

import java.util.HashMap;
import java.util.UUID;

public class InMemoryOrderRepository implements OrderRepository {

    private final HashMap<UUID, OrderRecord> orderRecords;

    public InMemoryOrderRepository(HashMap<UUID, OrderRecord> orderRecords) {
        this.orderRecords = orderRecords;
    }

    @Override public void save(Order order) {
//        orderRecords.put(order.id(), new OrderRecord(order.id, order.conferenceId(), order.seats()));

    }

    class OrderRecord {
        public UUID id() {
            return null;
        }
    }
}
