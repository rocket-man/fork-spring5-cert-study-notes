# What is the Health Indicator status?
```Health Indicator``` status is used by Health Indicators to inform Spring Actuator if system component checked by them 
is working correctly or not.

Each ```Health Indicator``` is expected to return status tht represents guarded component state, status can be one of the following:
- UP
- DOWN
- OUT_OF_SERVICE
- UNKNOWN
- Custom defined

Spring Actuator is also using ```HealthAggregator``` especially ```OrderedHealthAggregator``` to aggregate statuses from all
```Health Indicators```  and decide on final status. ```OrderedHealthAggregator``` is taking statuses from all ```Health Indicators```
sorts them by predefined order (DOWN, OUT_OF_SERVICE, UP, UNKNOWN) and takes first element after sorting, which represents
highest priority status and becomes final status of the system.

