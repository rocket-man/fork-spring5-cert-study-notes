package org.spring.cert.beans;

import org.springframework.stereotype.Component;

@Component
public class TaxBean1 implements ITaxBean {
    @Override
    public float calculateTax(float value) {
        return 5f;
    }
}
