package io.vocidelcodice.orders_and_registrations;

import io.vocidelcodice.orders_and_registrations.InMemoryOrderRepository.OrderRecord;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InMemoryOrderRepositoryTest {

    private static final UUID A_CONFERENCE_ID = UUID.randomUUID();

    @Test
    void save_an_order() {
        UUID orderId = UUID.randomUUID();
        Order order = new Order(orderId, A_CONFERENCE_ID, 3, Collections.emptyList());

        HashMap<UUID, OrderRecord> orderRecords = new HashMap<>();
        OrderRepository orderRepository = new InMemoryOrderRepository(orderRecords);

        orderRepository.save(order);

        OrderRecord orderRecord = orderRecords.get(orderId);
        assertThat(orderRecord).isNotNull();
        assertThat(orderRecord.id()).isEqualTo(orderId);
        //...
    }

}
