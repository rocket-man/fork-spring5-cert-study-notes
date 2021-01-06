# When do you want to use @WebMvcTest? What does it auto-configure?
You should use ```@WebMvcTest``` annotation when you want to write Integration Test that is focused on web layer of your
application. ```@WebMvcTest``` approach will create ```ApplicationContext``` that contains only web components and omits
any other components that are not part of the web layer. Other components, if required for the test, can be mocked with usage
of ```@MockBean``` annotation or delivered by ```@Configuration``` annotated class imported with usage of ```@Import``` annotation.

```@WebMvcTest``` support two cases:
- Single Controller Auto-Configuration - annotate test by providing Controller class - ```@WebMvcTest(CityController.class)```
- Multiple (All found) Controllers Auto-Configuration - just annotate test with ```@WebMvcTest```

```@WebMvcTest``` annotation will auto-configure:
- Mock Mvc
- ```@ControllerAdvice``` annotated class
- ```@JsonComponent``` annotated class
- ```@Converter``` annotated class
- ```@GenericConverter``` annotated class
- ```@Filter``` annotated class
- ```@WebMvcConfigurer``` annotated class
- ```@HandlerMethodArgumentResolver``` annotated class