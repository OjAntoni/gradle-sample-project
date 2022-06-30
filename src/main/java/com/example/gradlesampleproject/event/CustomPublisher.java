package com.example.gradlesampleproject.event;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class CustomPublisher {
    private ApplicationEventPublisher eventPublisher;

    public void publishEvent(String message){
        log.info("Published event: "+message);
        eventPublisher.publishEvent(new SomeEvent(this, message));
    }
}
