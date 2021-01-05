# What are the Health Indicators that are provided out of the box?
Spring Actuator provides following Health Indicators that are configured when proper
dependencies are found:
- ```ApplicationHealthIndicator``` - Default Implementation, always up.
- ```DiskSpaceHealthIndicator``` - Checks for low disk space.
- ```DataSourceHealthIndicator``` - Checks the status of a DataSource and optionally runs a test query.
- ```CassandraHealthIndicator``` - Checks that a Cassandra database is up.
- ```CouchbaseHealthIndicator``` - Checks that a Couchbase cluster is up.
- ```ElasticsearchHealthIndicator``` - Checks that an Elasticsearch cluster is up.
- ```HazelcastHealthIndicator``` - Checks that a Hazelcast server is up.
- ```InfluxDbHealthIndicator``` - Checks that an InfluxDB server is up.
- ```JmsHealthIndicator``` - Checks that a JMS broker is up.
- ```MailHealthIndicator``` - Checks that a mail server is up.
- ```MongoHealthIndicator``` - Checks that a Mongo database is up.
- ```RabbitHealthIndicator``` - Checks that a Rabbit server is up.
- ```RedisHealthIndicator``` - Checks that a Redis server is up.
- ```SolrHealthIndicator``` - Checks that a Solr server is up.
- ```Neo4jHealthIndicator``` - Checks the status of a Neo4j by executing a Cypher

Spring Actuator also provides Reactive Health Indicators for reactive applications, like those
using Spring WebFlux:
- ```CassandraReactiveHealthIndicator``` - Checks that a Cassandra database is up.
- ```CouchbaseReactiveHealthIndicator``` - Checks that a Couchbase cluster is up.
- ```MongoReactiveHealthIndicator``` - Checks that a Mongo database is up.
- ```RedisReactiveHealthIndicator``` - Checks that a Redis server is up.