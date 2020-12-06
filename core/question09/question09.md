# What is the preferred way to close an application context ? Does Spring Boot do this for you ?
It depends on the type of application you are creating:

- Standalone Non-Web Applications
    - Register Shutdown hook by calling ConfigurableApplicationContext#registerShutdownHook - recommended way
    - Call ConfigurableApplicationContext#close
    
    
- Web Application
    - ContextLoaderListener will automatically close context when web container will stop web application
    

- Spring Boot
    - Application Context will be automatically closed
    - Shutdown hook will be automatically registered
    - ContextLoaderListener applies to SpringBoot Web Applications as well
  
The preferred way depends on the type of application you are creating. For the stand alone application the preferred way
is to register the hook otherwise use the try-with-resources. The third way, to call context.close() manually is not 
recommended because if an exception is thrown then the context will not be closed

For the web application and spring boot applications the close is done automatically.
