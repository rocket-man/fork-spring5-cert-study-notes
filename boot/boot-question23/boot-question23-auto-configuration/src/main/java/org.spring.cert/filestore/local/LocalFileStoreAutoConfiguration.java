package org.spring.cert.filestore.local;

import org.spring.cert.filestore.FileStore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "file.store", havingValue = "local")
public class LocalFileStoreAutoConfiguration {
    @Bean
    public FileStore fileStore() {
        return new LocalFileStore();
    }
}
