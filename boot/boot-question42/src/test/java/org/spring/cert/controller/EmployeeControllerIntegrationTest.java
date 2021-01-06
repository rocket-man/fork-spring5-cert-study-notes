package org.spring.cert.controller;

import org.junit.jupiter.api.Test;
import org.spring.cert.dao.CityDao;
import org.spring.cert.dao.EmployeeDao;
import org.spring.cert.entity.City;
import org.spring.cert.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@WebMvcTest(EmployeeController.class)
class EmployeeControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private EmployeeDao employeeDao;

    @MockBean
    private CityDao cityDao;

    @Test
    public void shouldSaveEmployeeWithExistingCity() throws Exception {
        when(cityDao.findByName("New York")).thenReturn(Optional.of(NEW_YORK));

        mvc.perform(
                put("/employees")
                        .content("{ \"name\": \"John\", \"city\": \"New York\" }")
                        .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk());

        verify(employeeDao).save(new Employee("John", NEW_YORK));
    }

    @Test
    public void shouldNotSaveEmployeeWhenNonExistingCityInRequestFound() throws Exception {
        when(cityDao.findByName("New York")).thenReturn(Optional.empty());

        mvc.perform(
                put("/employees")
                        .content("{ \"name\": \"John\", \"city\": \"New York\" }")
                        .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isBadRequest());

        verify(employeeDao, never()).save(any());
    }

    @Test
    public void shouldFetchEmployees() throws Exception {
        when(employeeDao.findAll()).thenReturn(asList(EMPLOYEE1, EMPLOYEE2));

        String employeesJson = mvc.perform(get("/employees"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();

        assertEquals("{\"employees\":[" +
                "{\"id\":1,\"name\":\"John\",\"city\":{\"id\":1,\"name\":\"New York\"}}," +
                "{\"id\":2,\"name\":\"Dave\",\"city\":{\"id\":2,\"name\":\"Los Angeles\"}}" +
                "]}", employeesJson);
    }

    private static final City NEW_YORK = new City(1, "New York");
    private static final City LOS_ANGELES = new City(2, "Los Angeles");
    private static final Employee EMPLOYEE1 = new Employee(1, "John", NEW_YORK);
    private static final Employee EMPLOYEE2 = new Employee(2, "Dave", LOS_ANGELES);
}