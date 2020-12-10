package org.spring.cert.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile("!prod")
public class SpringBean3 {
}
