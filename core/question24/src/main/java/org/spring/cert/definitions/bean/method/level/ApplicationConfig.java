package org.spring.cert.definitions.bean.method.level;

import org.spring.cert.definitions.bean.method.level.dao.DatabaseStoreFinancialDataDao;
import org.spring.cert.definitions.bean.method.level.dao.FileStoreFinancialDataDao;
import org.spring.cert.definitions.bean.method.level.dao.FinancialDataDao;
import org.spring.cert.definitions.bean.method.level.service.FinancialReportService;
import org.spring.cert.definitions.bean.method.level.writer.DatabaseStoreFinancialReportWriter;
import org.spring.cert.definitions.bean.method.level.writer.FileStoreFinancialReportWriter;
import org.spring.cert.definitions.bean.method.level.writer.FinancialReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfig {

    @Bean
    public FinancialReportService financialReportService(FinancialDataDao financialDataDao, FinancialReportWriter financialReportWriter) {
        return new FinancialReportService(financialDataDao, financialReportWriter);
    }

    @Bean
    @Profile("database")
    public FinancialDataDao databaseStoreFinancialDataDao() {
        return new DatabaseStoreFinancialDataDao();
    }

    @Bean
    @Profile("database")
    public FinancialReportWriter databaseStoreFinancialReportWriter() {
        return new DatabaseStoreFinancialReportWriter();
    }

    @Bean
    @Profile("file")
    public FinancialDataDao fileStoreFinancialDataDao() {
        return new FileStoreFinancialDataDao();
    }

    @Bean
    @Profile("file")
    public FinancialReportWriter fileStoreFinancialReportWriter() {
        return new FileStoreFinancialReportWriter();
    }
}