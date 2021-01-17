# What is HttpMessageConverter ?
```HttpMessageConverter``` is an interface used by Spring to convert data between different formats.
REST client can specify expected format in which data should be retrieved by usage of ```Accept Header``` for example ```Accept: application/json```
Client can also specify format in which data will be send by usage of ```Content-Type Header```, for example ```Content-Type: application/xml```

Spring keeps list of ```HttpMessageConverters``` and for each request, data formats requested are being analysed and cross 
referenced with methods implemented in ```Controllers```. Whenever match is found Spring executes proper ```Controller Method``` and 
picks ```HttpMessageConverter``` to perform data conversion

Request mapping annotations contains ```produces``` and ```consumes``` fields which can be used to specify ```MediaType```
which method can handle.

Having method identified ```HttpMessageConverter```is used to:
- Convert ```HttpInputMessage``` to desired ```Type```
- Convert ```Type``` to ```HttpOutputMessage``` 


```HttpMessageConverter``` interface specifies contract for following behaviours: 
- ```canRead``` - indicates whether given ```MediaType``` can be written by converter
- ```canWrite``` - indicates whether given ```MediaType``` can be written by converter.
- ```getSupportedMediaTypes``` - returns supported list of ```MediaTypes```
- ```read``` - Converts ```HttpInputMessage``` to ```Type```
- ```write``` - Converts ```Type``` to ```HttpOutputMessage```

You can register custom ```HttpMessageConverter``` by implementing ```WebMvcConfigurer```

```java
@Configuration
public class WebConfiguration implements WebMvcConfigurer{
    
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters){
        //...
    }
}

```

When using Spring Boot, most ```HttpMessageConverters``` will be registered automatically. Automatic registration is implemented
in ```HttpMessageConvertersAutoConfiguration``` and default list of converters is created inside ```WebMvcConfigurationSupport.addDefaultHttpMessageConverts```

Commonly used ```HttpMessageConvertes``` are:
- MappingJackson2HttpMessageConverter
- MappingJackson2XmlMessageConverter
- Jaxb2RootElementHttpMessageConverter
- FormHttpMessageConverter
- RssChannelHttpMessageConverter
- AtomFeedHttpMessageConverter
- StringHttpMessageConverter
- ByteArrayHttpMessageConverter

