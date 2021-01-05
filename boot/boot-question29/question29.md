# How do you access an endpoint using a tag?
You access an endpoint using a tag by defining it as part of the request in following way:
```tag=KEY:VALUE```

For example:
```
/actuator/metrics/http.server.requests?tag=status:200
/actuator/metrics/jvm.memory.max?tag=area:heap
```

You can also use multiple tags in one query with usage of & in the following way:
```
tag=KEY1:VALUE1&tag=KEY2:VALUE2
```

For example:
```
/actuator/metrics/http.server.requests?tag=status:200&tag=method:GET
/actuator/metrics/jvm.memory.max?tag=area:heap&tag=id:G1%200ld%20Gen
```

Tag is used to filter results of query by one or multiple dimensions. It is often used with ```metrics``` endpoint for 
data filtering.


