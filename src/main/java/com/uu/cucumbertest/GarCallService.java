package com.uu.cucumbertest;

import org.springframework.stereotype.Service;

@Service
public class GarCallService {

    private final GarCall garCall;

    public GarCallService(GarCall garCall) {
        this.garCall = garCall;
    }

    public String doCall() {
        return garCall.call();
    }
}
