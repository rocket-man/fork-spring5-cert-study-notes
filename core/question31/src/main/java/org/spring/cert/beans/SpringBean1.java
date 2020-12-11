package org.spring.cert.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:application.properties")
public class SpringBean1 {
    @Value("${app.file.property:Unknown}")
    private String appFileProperty;
    @Value("${app.vm.property:Unknown}")
    private String appVmProperty;
    @Value("${app.env.property:Undefined}")
    private String appEnvProperty;
    @Value("${user.home:nullNotKnown}")
    private String userHome;
    @Value("${JAVA_HOME:nNn}")
    private String javaHome;
    @Value("${MAVEN_HOME:nNn}")
    private String mavenHome;

    public String getAppFileProperty() {
        return appFileProperty;
    }

    public String getAppVmProperty() {
        return appVmProperty;
    }

    public String getAppEnvProperty() {
        return appEnvProperty;
    }

    public String getUserHome() {
        return userHome;
    }

    public String getJavaHome() {
        return javaHome;
    }

    public String getMavenHome() {
        return mavenHome;
    }
}
