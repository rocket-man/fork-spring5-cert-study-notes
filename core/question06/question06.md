# How are you going to create a new instance of an ApplicationContext

Non-Web Applications:
- AnnotationConfigApplicationContext
- ClassPathXmlApplicationContext
- FileSystemXmlApplicationContext

Web Applications:
- Servlet 2 - web.xml, ContextLoaderListener, DispatcherServlet
- Servlet 3 - XmlWebApplicationContext
- Servlet 3 - AnnotationConfigWebApplicationContext

SpringBoot:
- SpringBootConsoleApplication - CommandLineRunner
- SpringBootWebApplication - Embedded Tomcat