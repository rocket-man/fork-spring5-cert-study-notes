# What are some of the parameter types for a controller method
- ```WebRequest```, ```NativeWebRequest``` - access to HTTP request details, parameters, also request and session attributes,
 without direct use of the Servlet API
- ```javax.servlet.ServletRequest``` - object to provide client request information allows access parameters, attributes and 
other request details without direct use of Spring Interfaces
- ```javax.servlet.ServletResponse``` - object created by servlet container, passed to service method of servlet, used by 
servlet to send a response to the client
- ```javax.servlet.http.HttpSession``` - allows access the session information and attributes, also enforces HTTP session 
for request
- ```javax.servlet.http.PushBuilder``` - Servlet 4.0 push builder API for programmatic HTTP/2 resource pushes, allows resources 
to be delivered in advance by the server, resulting in a faster load time.
- ```java.security.Principal``` - currently authenticated user 
- ```HttpMethod``` - HTTP methods used for request, one of GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE
- ```java.util.locale``` - request locale, determined by most specific ```LocaleResolver``` available
- ```java.util.TimeZone + java.time.ZoneId``` -  time zone associated with the current request, as determined by a ```LocalContextResolver```
- ```java.io.InputStream, java.io.Reader``` - allows access to raw request body as exposed by the Servlet API.
- ```java.io.OutputStream, java.io.Writer``` - allows to create raw response as exposed by the server API.
- ```HttpEntity<B>``` - container object that exposes request headers and body, body is converted with usage of ```HttpMessageConverter```
- ```java.util.map, org.springframework.ui.Model, org.springframework.ui.ModelMap``` - used to expose data to templates as part of view rendering
- ```RedirectsAttributes``` - specify attributes to use in case of redirect, regular attributes will be added to query String 
and flash attributes will be kept temporarily until the end of request, flash attributes are kept typically in the session and are
  removed immediately after request is completed. 
- ```Errors, BindingResult``` - used to gain access to form validation and binding data results, can be used with 
```@ModelAttribute, @RequestBody``` or ```@RequestPart``` argument, ```Error``` and ```BindingResult``` argument must be declared
  immediately after the validated method argument.
- ```SessionStatus``` + class-level ```@SessionAttribute``` - useful for multi step form processing, ```@SessionAttributes```
  allows to keep ```@ModelAttribute``` objects between requests and ```SessionStatus``` allows to clean session variables
  when form processing is done. 
- ```UriComponentsBuilder``` - used to build URLs relative to current scheme, host, port, contextPath, etc.
- Any other argument - if method argument is not matched against types defined before, and it is simple type, it is treated 
as ```@RequestParam```, if it is a complex type, it is treated as ```@ModelAttribute```