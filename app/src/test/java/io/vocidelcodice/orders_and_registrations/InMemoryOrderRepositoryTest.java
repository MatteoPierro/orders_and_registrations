package io.vocidelcodice.orders_and_registrations;

import io.vocidelcodice.orders_and_registrations.InMemoryOrderRepository.OrderRecord;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InMemoryOrderRepositoryTest {

    private static final UUID A_CONFERENCE_ID = UUID.randomUUID();
    private static final int NUMBER_OF_SEATS = 3;

    @Test
    void save_an_order() {
        UUID orderId = UUID.randomUUID();
        Order order = new Order(orderId, A_CONFERENCE_ID, NUMBER_OF_SEATS, emptyList());

        Map<UUID, OrderRecord> records = new HashMap<>();
        OrderRepository orderRepository = new InMemoryOrderRepository(records);

        orderRepository.save(order);

        OrderRecord orderRecord = records.get(orderId);
        assertThat(orderRecord.id()).isEqualTo(orderId);
        assertThat(orderRecord.conferenceId()).isEqualTo(A_CONFERENCE_ID);
        assertThat(orderRecord.seats()).isEqualTo(NUMBER_OF_SEATS);
    }

}
