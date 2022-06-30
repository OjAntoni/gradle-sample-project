package com.example.gradlesampleproject.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;


public class SomeEvent extends ApplicationEvent {
    @Getter
    private String info;

    public SomeEvent(Object source, String info) {
        super(source);
        this.info = info;
    }
}
