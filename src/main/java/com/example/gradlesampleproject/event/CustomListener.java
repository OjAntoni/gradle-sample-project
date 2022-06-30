package com.example.gradlesampleproject.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomListener implements ApplicationListener<SomeEvent> {
    @Override
    public void onApplicationEvent(SomeEvent event) {
        log.info(String.format("Message \"%s\" received", event.getInfo()));
    }
}
