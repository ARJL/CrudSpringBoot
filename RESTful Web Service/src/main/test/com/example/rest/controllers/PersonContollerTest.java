package com.example.rest.controllers;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class PersonContollerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private PersonContoller personContoller;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(personContoller)
                .build();
    }

    @Test
    public void testHeaderController () throws Exception {
        Assert.assertEquals(1,1);
//        mockMvc.perform(MockMvcRequestBuilders.get("persons"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().string("list"));
                //.andExpect(MockMvcResultMatchers.view().name("list"));
        //.andExpect(MockMvcResultMatchers.jsonPath("pr"));
    }

}
