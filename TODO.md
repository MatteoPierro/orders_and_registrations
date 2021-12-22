# TODO

* CommandHandler should be transactional
* Event Handling
* Read Model
* Acceptance tests from the point of view of a controller sending a command to the command bus
* Implement a real TransactionalOrderRepository
  * Ensure transactional boundaries (should be within the repo or in the command handler?)
  * How to avoid concurrent writes?
* What happens if we try to place an order with an existing ID?
* `OrderCommandHandler` is the right name?
* `List<Event> changes`?
* Validate the command `RegisterToConferenceCommand`
* Introduce different types of seats when placing an order
* [extra] what about the aggregates publishing their events on the event bus?
  * or else, in the command handler?
* Rename `OrderRepository` to `Orders`

## IDEAS

* start from?
  * the command handler
    * OrderCommandHandler
  * from the aggregates
  * events => process manager => commands
