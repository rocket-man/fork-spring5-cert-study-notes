package org.spring.cert.data.layer;

import org.spring.cert.ds.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HttpDataLayer {
    public void saveData(List<Person> persons) {
        System.out.println("Saving data to http...");

        persons.forEach(System.out::println);

        System.out.println("Done");
    }
}
