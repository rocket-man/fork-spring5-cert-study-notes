package org.spring.cert.definitions.configuration.level;


import org.spring.cert.definitions.configuration.level.dao.FileStoreFinancialDataDao;
import org.spring.cert.definitions.configuration.level.dao.FinancialDataDao;
import org.spring.cert.definitions.configuration.level.writer.FileStoreFinancialReportWriter;
import org.spring.cert.definitions.configuration.level.writer.FinancialReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("file")
public class FileApplicationConfiguration {
    @Bean
    public FinancialDataDao fileStoreFinancialDataDao() {
        return new FileStoreFinancialDataDao();
    }

    @Bean
    public FinancialReportWriter fileStoreFinancialReportWriter() {
        return new FileStoreFinancialReportWriter();
    }
}
