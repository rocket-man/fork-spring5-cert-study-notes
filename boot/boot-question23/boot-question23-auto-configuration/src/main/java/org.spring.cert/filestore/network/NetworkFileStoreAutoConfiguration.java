package org.spring.cert.filestore.network;

import org.spring.cert.filestore.FileStore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "file.store", havingValue = "network")
public class NetworkFileStoreAutoConfiguration {
    @Bean
    public FileStore networkFileStore() {
        return new NetworkFileStore();
    }
}
