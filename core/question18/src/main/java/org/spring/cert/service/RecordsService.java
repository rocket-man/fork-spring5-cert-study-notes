package org.spring.cert.service;

import org.spring.cert.bls.RecordsProcessor;
import org.spring.cert.reader.RecordsReader;
import org.spring.cert.validator.RecordsValidator;
import org.spring.cert.validator.RecordsValidatorType;
import org.spring.cert.writer.RecordsWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import static org.spring.cert.validator.RecordsValidatorType.RecordsValidatorMode.FILE;


@Service
public class RecordsService {
    @Autowired
    @Qualifier("dbRecordsProcessor")
    private RecordsProcessor recordsProcessor;

    @Autowired
    @Qualifier("file-records-reader")
    private RecordsReader recordsReader;

    @Autowired
    @Qualifier("db-writer")
    private RecordsWriter recordsWriter;

    @Autowired
    @RecordsValidatorType(FILE)
    private RecordsValidator recordsValidator;
}
