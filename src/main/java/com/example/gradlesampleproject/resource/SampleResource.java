package com.example.gradlesampleproject.resource;

import com.example.gradlesampleproject.event.CustomPublisher;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@AllArgsConstructor
@RestController
public class SampleResource {
    private CustomPublisher publisher;

    @GetMapping("/hello")
    public String greet(){
        publisher.publishEvent("/hello invoked on "+LocalTime.now());
        return "Hello, user!";
    }
}
