package com.mynameismikegreen.springeventsexample.controller;

import com.mynameismikegreen.springeventsexample.event.RequestMadeEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    private final ApplicationEventPublisher applicationEventPublisher;

    public ExampleController(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @GetMapping(value = "/")
    public ResponseEntity<String> fireEvent() {
        RequestMadeEvent event = new RequestMadeEvent(this, "Event message goes here");
        applicationEventPublisher.publishEvent(event);
        return new ResponseEntity<>("Event fired.", HttpStatus.OK);
    }

}
