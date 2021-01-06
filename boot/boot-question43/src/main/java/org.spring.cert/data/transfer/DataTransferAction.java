package org.spring.cert.data.transfer;


import org.spring.cert.data.layer.FtpDataLayer;
import org.spring.cert.data.layer.HttpDataLayer;
import org.spring.cert.ds.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataTransferAction {

    @Autowired
    FtpDataLayer ftpDataLayer;
    @Autowired
    HttpDataLayer httpDataLayer;

    public void transfer() {
        List<Person> personData = ftpDataLayer.getData();

        httpDataLayer.saveData(personData);
    }
}
