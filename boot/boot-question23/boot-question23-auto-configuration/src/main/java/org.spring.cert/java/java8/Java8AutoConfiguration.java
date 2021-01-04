package org.spring.cert.java.java8;

import org.spring.cert.java.JavaEnvInfo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnJava(value = JavaVersion.NINE, range = ConditionalOnJava.Range.OLDER_THAN)
public class Java8AutoConfiguration {
    @Bean
    public JavaEnvInfo javaEnvInfo() {
        return new Java8EnvInfo();
    }
}
