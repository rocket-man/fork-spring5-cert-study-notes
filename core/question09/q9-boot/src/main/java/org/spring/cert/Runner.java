package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * In spring boot the close is done automatically. After running the application
 * you can see both messages; Hello and @PreDestroy SpringBean1 and the hook is not registered and
 * the context is not closed manually. This is done underneath the hood by Spring boot
 * */

@SpringBootApplication
public class Runner implements CommandLineRunner {

    @Autowired
    private SpringBean1 springBean1;

    public static void main(String[] args) {
        SpringApplication.run(Runner.class);
    }

    @Override
    public void run(String... args) throws Exception {
        springBean1.sayHello();
    }
}
