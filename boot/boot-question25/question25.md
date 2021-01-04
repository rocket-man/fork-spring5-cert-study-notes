# What are the two protocols you can use to access actuator endpoints?
Spring Actuator supports two protocols:
- HTTP
- JMX

HTTP endpoints can be accessed by any HTTP Client, like CURL or Web Browser, by defualt following are enabled:
- ```/actuator/info```
- ```/actuator/health```

JMX allows you to access Actuator MBeans under ```org.springframework.boot``` group. You can access it with any tool that 
supports JMX protocol. One of the tool that you can use is JConsole which comes with JDK. You can access JMX:
- Locally by PID (enabled by default since Java SE6)
- Remotely via Socket after enabling it with following Java VM flags (below example setup is simple but unsecure, do not use in production):
```properties
-Dcom.sun.management.jmxremote.local.only=false
-Dcom.sun.management.jmxremote.port=9010
-Dcom.sun.management.jmxremote.authenticate=false
-Dcom.sun.management.jmxremote.ssl=false
```
