package com.sonpen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sonikju on 2018-09-02.
 */
@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping("/foo")
    public String foo() {
        return sampleService.getName();
    }
}
