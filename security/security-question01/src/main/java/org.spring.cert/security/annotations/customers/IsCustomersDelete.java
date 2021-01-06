package org.spring.cert.security.annotations.customers;

import org.springframework.security.access.annotation.Secured;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.spring.cert.security.SecurityRoles.CUSTOMERS_DELETE;
import static org.spring.cert.security.SecurityRoles.ROLE_PREFIX;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Secured(ROLE_PREFIX + CUSTOMERS_DELETE)
public @interface IsCustomersDelete {
}
