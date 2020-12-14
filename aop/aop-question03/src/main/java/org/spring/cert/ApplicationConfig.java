package org.spring.cert;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan
@EnableAspectJAutoProxy
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApplicationConfig {
}
