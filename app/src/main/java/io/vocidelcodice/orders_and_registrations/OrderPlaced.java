package io.vocidelcodice.orders_and_registrations;

import java.util.UUID;

public record OrderPlaced(UUID orderId, UUID conferenceId, Integer numberOfSeats) implements Event {
}
