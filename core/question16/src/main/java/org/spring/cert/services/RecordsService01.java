package org.spring.cert.services;

import org.spring.cert.backup.DbRecordsBackup;
import org.spring.cert.bls.DbRecordsProcessor;
import org.spring.cert.non.beans.RecordsHash;
import org.spring.cert.non.beans.RecordsUtil;
import org.spring.cert.non.beans.RecordsValidator;
import org.spring.cert.reader.DbRecordsReader;
import org.spring.cert.writer.DbRecordsWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class RecordsService01 {

    @Autowired
    public DbRecordsReader recordsReader;
    @Autowired
    protected DbRecordsBackup recordsBackup;
    @Autowired
    private DbRecordsProcessor recordsProcessor;
    @Autowired
    DbRecordsWriter recordsWriter;
    @Autowired
    private Optional<RecordsHash> recordsHash;
    @Autowired
    @Nullable
    private RecordsUtil recordsUtil;
    @Autowired(required = false)
    private RecordsValidator recordsValidator;

    public RecordsService01(){
        System.out.println(
            getClass().getSimpleName() + " recordsReader = " + recordsReader + "\n" +
                    getClass().getSimpleName() + " recordsBackup = " + recordsBackup + "\n" +
                    getClass().getSimpleName() + " recordsProcessor = " + recordsProcessor + "\n" +
                    getClass().getSimpleName() + " recordsWriter = " + recordsWriter + "\n" +
                    getClass().getSimpleName() + " recordsHash = " + recordsHash + "\n" +
                    getClass().getSimpleName() + " recordsUtil = " + recordsUtil + "\n" +
                    getClass().getSimpleName() + " recordsValidator = " + recordsValidator + "\n"
        );
    }

    @PostConstruct
    public void init(){
        System.out.println(
            getClass().getSimpleName() + " recordsReader = " + recordsReader + "\n" +
                    getClass().getSimpleName() + " recordsBackup = " + recordsBackup + "\n" +
                    getClass().getSimpleName() + " recordsProcessor = " + recordsProcessor + "\n" +
                    getClass().getSimpleName() + " recordsWriter = " + recordsWriter + "\n" +
                    getClass().getSimpleName() + " recordsHash = " + recordsHash + "\n" +
                    getClass().getSimpleName() + " recordsUtil = " + recordsUtil + "\n" +
                    getClass().getSimpleName() + " recordsValidator = " + recordsValidator + "\n"
        );
    }
}
