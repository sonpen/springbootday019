package com.sonpen;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sonikju on 2018-09-02.
 */
@Service("sampleService")
public class SampleService {

    RestTemplate restTemplate;

    public SampleService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public String getName() {
        return "sonpen";
    }

    public int getNumber() {
        return 100;
    }
}
