package org.spring.cert.bls;


import org.spring.cert.ds.Record;

import java.util.Collection;

public interface RecordsProcessor {
    Collection<Record> processRecords(Collection<Record> records);
}
