package org.spring.cert.controller;

import org.junit.jupiter.api.Test;
import org.spring.cert.ds.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;

import static java.lang.Integer.valueOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

@JsonTest
public class CityJsonTest {
    @Autowired
    private JacksonTester<City> json;

    @Test
    public void shouldSerialize() throws IOException {
        City city = new City(1, "New York");

        String json = this.json.write(city).getJson();

        assertEquals(json, "{\"id\":1,\"name\":\"New York\"}");
    }

    @Test
    public void shouldDeserialize() throws IOException {
        City city = json.parse("{\"id\":1,\"name\":\"New York\"}").getObject();

        assertEquals(valueOf(1), city.getId());
        assertEquals("New York", city.getName());
    }
}
