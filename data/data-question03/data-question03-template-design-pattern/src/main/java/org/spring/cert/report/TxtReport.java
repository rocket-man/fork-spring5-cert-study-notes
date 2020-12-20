package org.spring.cert.report;

public class TxtReport extends AbstractReport{
    @Override
    void appendHeader() {
        System.out.println("Appending Txt header");
    }

    @Override
    void appendText(String text) {
        System.out.println("Appending Txt text: " + text);

    }

    @Override
    void appendFooter() {
        System.out.println("Appending Txt footer");
    }
}
