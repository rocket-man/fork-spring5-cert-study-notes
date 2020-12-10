package org.spring.cert.bean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile({"database","file"})
public class SpringBean2 {
}
