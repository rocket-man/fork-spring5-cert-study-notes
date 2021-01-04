package org.spring.cert;

import org.spring.cert.filestore.FileStore;
import org.spring.cert.java.JavaEnvInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Runner implements CommandLineRunner {

    @Autowired
    private JavaEnvInfo javaEnvInfo;
    @Autowired
    private EmployeesService employeesService;
    @Autowired
    private FileStore fileStore;

    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        javaEnvInfo.printJvmEnvInfo();
        fileStore.printFileStoreInfo();

        employeesService.printEmails();
    }
}
