package io.vocidelcodice.orders_and_registrations;

import java.util.UUID;

public record Order(UUID orderId, UUID conferenceId, Integer numberOfSeats) { }
