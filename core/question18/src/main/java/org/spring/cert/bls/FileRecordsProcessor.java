package org.spring.cert.bls;

import org.spring.cert.ds.Record;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FileRecordsProcessor implements RecordsProcessor {
    @Override
    public Collection<Record> processRecords(Collection<Record> records) {
        return null;
    }
}
