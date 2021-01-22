package org.spring.cert.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class MutableCounter {
    private int number;

    public int getNumber() {
        return number;
    }

    public void countUp() {
        ++number;
    }
}
