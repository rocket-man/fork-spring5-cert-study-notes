package org.spring.cert.services;

import org.spring.cert.reader.RecordsReader;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RecordsService05 {
    @Autowired
    public void setRecordsReaders(List<RecordsReader> recordsReaders) {
        System.out.println(getClass().getSimpleName() + " setRecordsReaders:");
        recordsReaders.stream()
                .map(r -> "\t" + r.getClass().getSimpleName())
                .forEach(System.out::println);
    }
}
