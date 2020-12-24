Spring Events Example
=====================

Minimalistic example of Spring events.

Referenced by: https://github.com/MyNameIsMikeGreen/tech-notes/blob/master/technologies/Spring_Events.md

# Usage
* Launch the application with:
    ```shell script
    mvn spring-boot:run
    ```

* Use a browser or REST client to access http://localhost:8080/
* Observe the system logs
* Notice how when `AsynchronousSpringEventsConfig` is enabled, the request is responded to quickly and the listener log messages are intertwined. However, if the config is disabled, the response is not returned until the listeners have fully executed and that the the second listener is not invoked until the first has completed.