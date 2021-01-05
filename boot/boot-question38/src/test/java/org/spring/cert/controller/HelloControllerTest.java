package org.spring.cert.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.spring.cert.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private NameService nameService;

    @Test
    public void shouldSayHello() throws Exception {
        Mockito.when(nameService.sayHello()).thenReturn("Test");

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andReturn();
        assertEquals("Hello Test", mvcResult.getResponse().getContentAsString());
    }
}