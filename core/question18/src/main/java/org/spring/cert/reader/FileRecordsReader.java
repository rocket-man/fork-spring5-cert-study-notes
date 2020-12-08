package org.spring.cert.reader;

import org.spring.cert.ds.Record;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component("file-records-reader")
public class FileRecordsReader implements RecordsReader {
    @Override
    public Collection<Record> readRecords() {
        return null;
    }
}
