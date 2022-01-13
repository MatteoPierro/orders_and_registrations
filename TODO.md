# TODO

* Event Handling (via subscribers/event listeners)
* Read Model
* Command Bus (to bring the command to the command handler)
* Acceptance tests from the point of view of a controller sending a command to the command bus
* `CommandHandler` should be transactional
  * in order to do this in a concrete way, we want to hook in a real database
* Implement EventBus considering how to handle a batch of messages in a transaction
* What happens if we try to place an order with an existing ID?
* `OrderCommandHandler` is the right name? Is it too generic as a name?
* `List<Event> changes`?
* Validate the command `RegisterToConferenceCommand`
* Introduce different types of seats when placing an order
* Rename `OrderRepository` to `Orders`

## IDEAS

* start from?
  * the command handler
    * OrderCommandHandler
  * from the aggregates
  * events => process manager => commands
