package org.spring.cert;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan
@EnableAspectJAutoProxy
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApplicationConfig {
}
