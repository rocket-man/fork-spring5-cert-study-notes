package org.spring.cert.security;

import org.spring.cert.security.utils.RolesHierarchyBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;

import static org.spring.cert.security.SecurityRoles.*;

@Configuration
public class RoleHierarchyConfiguration {

    @Bean
    public RoleHierarchy roleHierarchy() {
        RoleHierarchyImpl roleHierarchy = new RoleHierarchyImpl();
        roleHierarchy.setHierarchy(
                new RolesHierarchyBuilder()
                        .append(CUSTOMERS_ADMIN, CUSTOMERS_CREATE)
                        .append(CUSTOMERS_ADMIN, CUSTOMERS_READ)
                        .append(CUSTOMERS_ADMIN, CUSTOMERS_DELETE)

                        .build()
        );

        return roleHierarchy;
    }
}
