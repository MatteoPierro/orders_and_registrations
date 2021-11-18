# TODO

* Implement OrderRepository
  * Persist the Order
  * Publish changes
* What happens if we try to place an order with an existing ID?
* `OrderCommandHandler` is the right name?
* `List<Event> changes`?
* Validate the command `RegisterToConferenceCommand`
* Introduce different types of seats when placing an order
* [extra] what about the aggregates publishing their events on the event bus?
* Rename `OrderRepository` to `Orders`

## IDEAS

* start from?
  * the command handler
    * OrderCommandHandler
  * from the aggregates
  * events => process manager => commands
* acceptance tests from the point of view of a controller sending a command to the command bus
