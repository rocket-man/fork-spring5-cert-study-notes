package org.spring.cert.custom.printer;

public class StandardValuePrinter implements ValuePrinter {
    @Override
    public void print(int value) {
        System.out.println(value);
    }
}
