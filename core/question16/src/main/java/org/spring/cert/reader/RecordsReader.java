package org.spring.cert.reader;


import org.spring.cert.ds.Record;

import java.util.Collection;

public interface RecordsReader {
    Collection<Record> readRecords();
}
