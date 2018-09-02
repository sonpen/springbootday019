package com.sonpen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by sonikju on 2018-09-02.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class SampleControllerTest {

    @Autowired
    MockMvc mockMvc;

    @LocalServerPort
    int port;

    @Autowired
    TestRestTemplate testRestTemplate;

    @MockBean
    SampleService sampleService;

//    @Test
//    public void testFoo() throws Exception {
//
//        assertThat(mockMvc).isNotNull();
//        mockMvc.perform(get("/foo"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("Hello"))
//                .andDo(print());
//    }

    @Test
    public void testFooWithRestTemplate() {
        given(sampleService.getName()).willReturn("Mock");

        String body = this.testRestTemplate.getForObject("/foo", String.class);
        assertThat(body).isEqualTo("Mock");
    }

}
