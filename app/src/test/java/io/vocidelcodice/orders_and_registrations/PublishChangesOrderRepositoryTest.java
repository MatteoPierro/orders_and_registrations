package io.vocidelcodice.orders_and_registrations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PublishChangesOrderRepositoryTest {

    @Mock
    private EventBus eventBus;

    @Test
    void publish_changes_when_save_an_order() {
        Event change = new DummyEvent();
        Order anOrder = new Order(null, null, null, List.of(change));

        OrderRepository orderRepository = new PublishChangesOrderRepository(eventBus);
        orderRepository.save(anOrder);

        verify(eventBus).publish(change);
    }

    private record DummyEvent() implements Event { }
}
