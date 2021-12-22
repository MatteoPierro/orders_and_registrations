package io.vocidelcodice.orders_and_registrations;

import java.util.List;

public interface EventBus {
    void publish(List<Event> event);
}
