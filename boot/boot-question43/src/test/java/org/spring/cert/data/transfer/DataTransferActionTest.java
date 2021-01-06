package org.spring.cert.data.transfer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.spring.cert.data.layer.FtpDataLayer;
import org.spring.cert.data.layer.HttpDataLayer;
import org.spring.cert.ds.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

//@RunWith(SpringRunner.class)
@SpringBootTest
@ExtendWith(SpringExtension.class)
class DataTransferActionManualMockInjectionTest {


    @Autowired
    private DataTransferAction dataTransferAction;
    @Mock
    private FtpDataLayer ftpDataLayer;
    @Mock
    private HttpDataLayer httpDataLayer;

    private static final List<Person> PERSON_LIST = Arrays.asList(
            new Person(98, "Test1"),
            new Person(99, "Test2")
    );

    @BeforeEach
    public void setUp() {
        dataTransferAction.ftpDataLayer = ftpDataLayer;
        dataTransferAction.httpDataLayer = httpDataLayer;
    }

    @Test
    public void shouldTransferDataFromFtpToHttp() {
        when(ftpDataLayer.getData()).thenReturn(PERSON_LIST);

        dataTransferAction.transfer();

        verify(httpDataLayer).saveData(PERSON_LIST);
    }

}