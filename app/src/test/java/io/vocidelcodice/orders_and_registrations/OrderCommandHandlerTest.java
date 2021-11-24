package io.vocidelcodice.orders_and_registrations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.UUID;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class OrderCommandHandlerTest {
    private static final UUID CONFERENCE_ID = UUID.randomUUID();
    private static final UUID ORDER_ID = UUID.randomUUID();
    private static final Integer NUMBER_OF_SEATS = 3;

    @Mock
    private OrderRepository orderRepository;

    @Test void place_an_order() {
        OrderCommandHandler orderCommandHandler = new OrderCommandHandler(orderRepository);
        orderCommandHandler.handle(
                new RegisterToConferenceCommand(CONFERENCE_ID, ORDER_ID, NUMBER_OF_SEATS)
        );

        Order order = new Order(
                ORDER_ID,
                CONFERENCE_ID,
                NUMBER_OF_SEATS,
                List.of(new OrderPlaced(ORDER_ID, CONFERENCE_ID, NUMBER_OF_SEATS))
        );
        verify(orderRepository).save(order);
    }
}
