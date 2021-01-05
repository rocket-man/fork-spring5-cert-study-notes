package org.spring.cert.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NameService {

    private String[] names = {"John", "Dave", "Tom"};
    private Random random = new Random();

    public String sayHello() {
        return names[random.nextInt(names.length)];
    }
}
