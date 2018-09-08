package com.sonpen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sonikju on 2018-09-02.
 */
@RestController
public class SampleController {

    private Logger logger = LoggerFactory.getLogger(SampleController.class);
    @Autowired
    SampleService sampleService;

    @GetMapping("/foo")
    public String foo() {
        logger.info("Hello World");
        return sampleService.getName();
    }
}
