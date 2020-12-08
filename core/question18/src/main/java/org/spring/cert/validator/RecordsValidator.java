package org.spring.cert.validator;


import org.spring.cert.ds.Record;

import java.util.Collection;

public interface RecordsValidator {
    void validate(Collection<Record> records);
}
