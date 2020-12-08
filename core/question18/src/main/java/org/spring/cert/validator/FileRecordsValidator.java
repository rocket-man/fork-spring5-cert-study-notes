package org.spring.cert.validator;

import org.spring.cert.ds.Record;
import org.springframework.stereotype.Component;

import java.util.Collection;

import static org.spring.cert.validator.RecordsValidatorType.RecordsValidatorMode.FILE;


@Component
@RecordsValidatorType(FILE)
public class FileRecordsValidator implements RecordsValidator {
    @Override
    public void validate(Collection<Record> records) {

    }
}
