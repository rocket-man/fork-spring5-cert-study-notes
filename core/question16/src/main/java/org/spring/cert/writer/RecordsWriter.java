package org.spring.cert.writer;


import org.spring.cert.ds.Record;

import java.util.Collection;

public interface RecordsWriter {
    void writeRecords(Collection<Record> records);
}
