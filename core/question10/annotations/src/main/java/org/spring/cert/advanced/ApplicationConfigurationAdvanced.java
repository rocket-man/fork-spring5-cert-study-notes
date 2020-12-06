package org.spring.cert.advanced;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
        basePackages = "org.spring.cert.beans",
//        basePackageClasses = "SpringBean1.class",
        includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern=".*Bean.*"),
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern=".*Bean1.*")
        )
public class ApplicationConfigurationAdvanced {

}
