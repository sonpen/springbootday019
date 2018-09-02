package com.sonpen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sonikju on 2018-09-02.
 */
@RestController
public class SampleController {

    @GetMapping("/foo")
    public String foo() {
        return "Hello";
    }
}
