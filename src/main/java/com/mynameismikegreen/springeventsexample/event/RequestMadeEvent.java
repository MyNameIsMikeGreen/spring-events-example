package com.mynameismikegreen.springeventsexample.event;

import org.springframework.context.ApplicationEvent;

public class RequestMadeEvent extends ApplicationEvent {

    private final String message;

    public RequestMadeEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

}
