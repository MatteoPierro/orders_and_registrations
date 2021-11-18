package io.vocidelcodice.orders_and_registrations;

import java.util.List;
import java.util.UUID;

public record Order(UUID orderId, UUID conferenceId, Integer numberOfSeats, List<Event> changes) {

    static Order place(UUID orderId, UUID conferenceId, Integer numberOfSeats) {
        return new Order(orderId, conferenceId, numberOfSeats);
    }

    Order(UUID orderId, UUID conferenceId, Integer numberOfSeats) {
        this(orderId, conferenceId, numberOfSeats, List.of(new OrderPlaced(orderId, conferenceId, numberOfSeats)));
    }
}
