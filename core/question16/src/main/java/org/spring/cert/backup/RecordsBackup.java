package org.spring.cert.backup;


import org.spring.cert.ds.Record;

import java.util.Collection;

public interface RecordsBackup {
    void backupRecords(Collection<Record> records);
}
