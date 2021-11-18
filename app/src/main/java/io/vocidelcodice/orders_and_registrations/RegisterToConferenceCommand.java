package io.vocidelcodice.orders_and_registrations;

import java.util.UUID;

public record RegisterToConferenceCommand(UUID conferenceId, UUID orderId, Integer numberOfSeats) {}
