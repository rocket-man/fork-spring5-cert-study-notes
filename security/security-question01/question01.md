# What are authentication and authorization? Which must come first?
**Authentication** is a process of verifying that user, device or external system is who he claims to be. It involves 
validation that submitted proof of identity is true.

In other words, authentication answers question "Who are you?", and checks if provided answer is valid.

Process usually involves one side sending identity and Credentials that is used to validate that identity statement is true,
and other side that checks Credential and accepts or rejects claimed Identity based on Credential.

```
1) User logs in using ID and Credentials(username/password)
2) The application/webapp either ACCEPTS or REJECTS
```

Authentication may take different forms, the simplest one uses username as Identity and password as credential - proof of identity. _Source code example provided_
```
1) User sends request to protected request
2) Application returns HTTP 302 Redirects to /loggin page
3) User submits form with usernama and password
4) The system then
    4a) Upon success, redirects to protected resource
    4b) Upon failure, redirects to /login-error page 
```


More sophisticated forms of authentication, may involve three parties for implementation of Central Authentication Service (CAS)
to allow single sign-on
```
1) User sends request to protected resource
2) Application returns HTTP 302 Redirects to external page for single sign-on
3) User get /loggin page
4) CAS HTTP 200 returns Login Page
5) User then submits form with username and password
6) CAS provides ticket to user
7) User requests protected resource to the application with the ticket
8) Application forwards to the CAS in order to validate the ticket
9) Application provides requested resource based on the validation provided by the CAS
```

Recently, Multi Factory Authentication is becoming more popular to provide greater degree of security.

```
1) User sends request to protected resource
2) Application returns HTTP 302 Redirects to external page for single sign-on
3) User get /loggin page
4) CAS HTTP 200 returns Login Page
5) User then submits form with username and password to the MFA Server
6) MFA HTTP 200 Returns Token Page
7) User request Token to Smart Phone
8) Smart Phone reads the token
9) User Submits the Token to MFA Server
10) MFA provides ticket to the User
11) User request propected resource with the ticket to the Application
12) The Application validates the provided ticket with the MFA Server
13) Application provides requested resource based on the validation provided by the MFA
```

Spring Security provides following support for Authentication:
- Username and password Authentication
    - Form Login
    - Basic Authentication
    - Digest Authentication
- Remember-Me Authentication
- OpenID Support
- CAS Authentication (single sign-on)
- X.509 Certificate Authentication
- OAuth 2.0 Login
- SAML2
- Storage Mechanism
    - Simple Storage with In-Memory authentication
    - Relational DB with JDBC Authentication
    - Custom data stores with UserDetailsService
    - LDAP storage with LDAP authentication
    
- Password Encoders
    - bcrypt
    - PBKDF2
    - scrypt
    - argon2
    - sha256
    - ...
---

**Authorization** is a process of determining whether an authenticated user is allowed to access certain resources within 
the system or allowed to perform a certain action within the application.

In other words, authorization answers question "What are you allowed to do?".

Authorization usually uses formalized policy specified as access control rules, to determine allowed and disallowed parts
of the system that authenticated user can visit and act upon.

Spring Security allows you to implement **authorization** within your application on two levels:
- Web security Level with usage of Expression
  - mvcMatcher("/admin/**").hasRole("ADMIN")
  

- Method Security Level with usage of:
  - @Secured annotation
  - @PreAuthorize annotation
  - JSR 250 annotations
    - @RolesAllowed
    - @PermitAll
    - @DenyAll
    - ...
  

Access Control Rules can be expressed via:
_the main difference between Roles and Authorities are the semantics. They are very similar; one is high-level whereas the other one is low-level_
- Roles
  - represents a high-level set of privileges, for example ROLE_ADMIN, ROLE_STAFF, ROLE_CUSTOMER, etc..
  - Used with expressions like ```hasRole```

- Authorities
  - represents a low-level, granular privilege/authority in the system for example READ_CUSTOMERS, DELETE_EMPLOYEE, ACCESS_API...
  - used with expressions like ```hasAuthority```
  
- Hierarchical Roles
  - Allows you to specify relationship between roles and express that one role includes all permissions granted to other role
  - Example: 
    - ROLE_ADMIN > ROLE_STAFF means ROLE_ADMIN includes ROLE_STAFF
  
---

# Which must come first?
**Authentication** needs to be executed first, before authorization, because for authorization process to know which roles/authorities
can be granted for particular user, system needs to be sure that user is who he claims to be.