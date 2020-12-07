package org.spring.cert.services;

import org.spring.cert.backup.DbRecordsBackup;
import org.spring.cert.bls.DbRecordsProcessor;
import org.spring.cert.reader.DbRecordsReader;
import org.spring.cert.writer.DbRecordsWriter;

public class RecordsService02 {
    public RecordsService02(DbRecordsReader recordsReader, DbRecordsBackup recordsBackup, DbRecordsProcessor recordsProcessor, DbRecordsWriter recordsWriter) {
        System.out.println(
                getClass().getSimpleName() + " recordsReader = " + recordsReader + "\n" +
                        getClass().getSimpleName() + " recordsBackup = " + recordsBackup + "\n" +
                        getClass().getSimpleName() + " recordsProcessor = " + recordsProcessor + "\n" +
                        getClass().getSimpleName() + " recordsWriter = " + recordsWriter + "\n"
        );
    }
}
