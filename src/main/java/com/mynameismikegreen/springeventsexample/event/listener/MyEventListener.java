package com.mynameismikegreen.springeventsexample.event.listener;

import com.mynameismikegreen.springeventsexample.event.RequestMadeEvent;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyEventListener {

    @SneakyThrows
    @EventListener
    public void handleRequestMadeEvent(RequestMadeEvent event) {
        log.info("Event listener 1.1");
        Thread.sleep(1000);
        log.info("Event listener 1.2");
        Thread.sleep(1000);
        log.info("Event listener 1.3");
        Thread.sleep(1000);
        log.info("Event listener 1.4");
        Thread.sleep(1000);
        log.info("Event listener 1.5");

    }

    @SneakyThrows
    @EventListener
    public void handleRequestMadeEvent2(RequestMadeEvent event) {
        log.info("Event listener 2.1");
        Thread.sleep(2000);
        log.info("Event listener 2.2");
        Thread.sleep(3000);
        log.info("Event listener 2.3");
        Thread.sleep(4000);
        log.info("Event listener 2.4");
        Thread.sleep(5000);
        log.info("Event listener 2.5");
    }

}
