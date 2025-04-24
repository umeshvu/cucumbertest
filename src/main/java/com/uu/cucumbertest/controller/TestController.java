package com.uu.cucumbertest.controller;

import com.uu.cucumbertest.GarCallService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final GarCallService service;

    public TestController(GarCallService service) {
        this.service = service;
    }

    @GetMapping("/call")
    public String call() {
        return service.doCall();
    }
}

