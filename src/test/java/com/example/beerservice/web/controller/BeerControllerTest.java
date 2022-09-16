package com.example.beerservice.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

@WebMvcTest(BeerController.class)
class BeerControllerTest {

MockMvc mockMvc;

ObjectMapper objectMapper;
    @Test
    void getBeerId() throws Exception {

    }

    @Test
    void saveNewBeer() {
    }

    @Test
    void updateById() {
    }
}