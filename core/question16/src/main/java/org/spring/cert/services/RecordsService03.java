package org.spring.cert.services;

import org.spring.cert.bls.DbRecordsProcessor;
import org.spring.cert.non.beans.RecordsHash;
import org.spring.cert.non.beans.RecordsUtil;
import org.spring.cert.non.beans.RecordsValidator;
import org.spring.cert.reader.DbRecordsReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class RecordsService03 {
    @Autowired
    private RecordsService03(DbRecordsReader recordsReader, DbRecordsProcessor recordsProcessor, Optional<RecordsUtil> recordsUtil, @Nullable RecordsHash recordsHash, @Autowired(required = false) RecordsValidator recordsValidator) {
        System.out.println(
                getClass().getSimpleName() + " recordsReader = " + recordsReader + "\n" +
                        getClass().getSimpleName() + " recordsProcessor = " + recordsProcessor + "\n" +
                        getClass().getSimpleName() + " recordsUtil = " + recordsUtil + "\n" +
                        getClass().getSimpleName() + " recordsHash = " + recordsHash + "\n" +
                        getClass().getSimpleName() + " recordsValidator = " + recordsValidator + "\n"
        );
    }

    //@Autowired
    RecordsService03(DbRecordsReader recordsReader, DbRecordsProcessor recordsProcessor) {
        System.out.println(
                getClass().getSimpleName() + " recordsReader = " + recordsReader + "\n" +
                        getClass().getSimpleName() + " recordsProcessor = " + recordsProcessor + "\n"
        );
    }
}
