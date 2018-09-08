package com.sonpen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by sonikju on 2018-09-08.
 */
@RunWith(SpringRunner.class)
@JsonTest
public class SampleJsonTest {

    @Autowired
    JacksonTester<Sample> jacksonTester;

    @Test
    public void testJson() throws IOException {
        Sample sample = new Sample();
        sample.setName("sonpen");
        sample.setAge(20);

        assertThat(jacksonTester.write(sample)).hasJsonPathStringValue("@.name");
    }

}
