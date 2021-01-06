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

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@WebMvcTest
public class AllEmployeeAndCityControllersIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CityDao cityDao;
    @MockBean
    private EmployeeDao employeeDao;

    @Test
    public void shouldSaveCitiesAndEmployees() throws Exception {
        mvc.perform(
                put("/cities")
                        .content("{ \"name\": \"New York\" }")
                        .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk());

        mvc.perform(
                put("/cities")
                        .content("{ \"name\": \"Los Angeles\" }")
                        .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk());

        when(cityDao.findByName(NEW_YORK_NAME)).thenReturn(Optional.of(NEW_YORK));
        when(cityDao.findByName(LOS_ANGELES_NAME)).thenReturn(Optional.of(LOS_ANGELES));

        mvc.perform(
                put("/employees")
                        .content("{ \"name\": \"John\", \"city\": \"New York\" }")
                        .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk());

        mvc.perform(
                put("/employees")
                        .content("{ \"name\": \"Dave\", \"city\": \"Los Angeles\" }")
                        .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk());

        verify(cityDao).save(City.builder().name(NEW_YORK_NAME).build());
        verify(cityDao).save(City.builder().name(LOS_ANGELES_NAME).build());
        verify(employeeDao).save(new Employee("John", NEW_YORK));
        verify(employeeDao).save(new Employee("Dave", LOS_ANGELES));
    }

    private static final String NEW_YORK_NAME = "New York";
    private static final String LOS_ANGELES_NAME = "Los Angeles";
    private static final City NEW_YORK = new City(1, NEW_YORK_NAME);
    private static final City LOS_ANGELES = new City(2, LOS_ANGELES_NAME);
}
