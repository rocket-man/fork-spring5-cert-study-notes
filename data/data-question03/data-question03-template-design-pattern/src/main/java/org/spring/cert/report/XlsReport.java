package org.spring.cert.report;

public class XlsReport extends AbstractReport{
    @Override
    void appendHeader() {
        System.out.println("Appending pdf header");
    }

    @Override
    void appendText(String text) {
        System.out.println("Appending pdf text: " + text);
    }

    @Override
    void appendFooter() {
        System.out.println("Appending pdf footer");
    }
}
