# Which are the limitations of the two proxy-types? What visibility must Spring bean methods have to be proxied using Spring AOP?
JDK Dynamic Proxy Limitations:
- Does not support self-invocation
- Class must implement interface
- Only method implementing the interface will be proxied

CGLIB Proxy Limitations:
- Does not support self-invocation.
- Class for which proxy should be created cannot be final.
- Method which should be proxied cannot be final.
- Only public/protected/package methods will be proxied, private methods are not proxied

Spring Bean methods need to have the following visibility level to be proxied:
- JDK Dynamic Proxy - public
- CGLIB Proxy - public/protected/package

On top of requirements above, for call to be proxied, it needs to come from outside, both JDK Dynamic Proxy and CGLIB Proxy
do not support self-invocation.