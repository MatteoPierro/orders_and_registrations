package io.vocidelcodice.orders_and_registrations;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class Order {
    private final UUID orderId;
    private final UUID conferenceId;
    private final Integer numberOfSeats;
    private final List<Event> changes;

    public Order(UUID orderId, UUID conferenceId, Integer numberOfSeats, List<Event> changes) {
        this.orderId = orderId;
        this.conferenceId = conferenceId;
        this.numberOfSeats = numberOfSeats;
        this.changes = changes;
    }

    static Order place(UUID orderId, UUID conferenceId, Integer numberOfSeats) {
        return new Order(
                orderId,
                conferenceId,
                numberOfSeats,
                List.of(new OrderPlaced(orderId, conferenceId, numberOfSeats))
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Order) obj;
        return Objects.equals(this.orderId, that.orderId) &&
                Objects.equals(this.conferenceId, that.conferenceId) &&
                Objects.equals(this.numberOfSeats, that.numberOfSeats) &&
                Objects.equals(this.changes, that.changes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, conferenceId, numberOfSeats, changes);
    }

    @Override
    public String toString() {
        return "Order[" +
                "orderId=" + orderId + ", " +
                "conferenceId=" + conferenceId + ", " +
                "numberOfSeats=" + numberOfSeats + ", " +
                "changes=" + changes + ']';
    }


}
