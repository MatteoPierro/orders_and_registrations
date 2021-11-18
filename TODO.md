# TODO
* `OrderCommandHandler` is the right name?
* [extra] what about the aggregates publishing their events on the event bus?

## IDEAS
* start from?
  * the command handler
    * OrderCommandHandler
  * from the aggregates
  * events => process manager => commands
* acceptance tests from the point of view of a controller sending a command to the command bus