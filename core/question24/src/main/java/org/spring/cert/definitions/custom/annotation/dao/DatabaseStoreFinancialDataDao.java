package org.spring.cert.definitions.custom.annotation.dao;

import org.spring.cert.definitions.custom.annotation.annotations.DatabaseProfile;
import org.spring.cert.definitions.custom.annotation.ds.FinancialMonthSummary;
import org.spring.cert.definitions.custom.annotation.ds.FinancialQuarterSummary;
import org.spring.cert.definitions.custom.annotation.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component
@DatabaseProfile
public class DatabaseStoreFinancialDataDao implements FinancialDataDao {
    @Override
    public FinancialYearSummary findFinancialYearSummary(int year) {
        System.out.println("Database Dao => findFinancialYearSummary");
        return new FinancialYearSummary();
    }

    @Override
    public FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter) {
        System.out.println("Database Dao => findFinancialQuarterSummary");
        return new FinancialQuarterSummary();
    }

    @Override
    public FinancialMonthSummary findFinancialMonthSummary(int year, int month) {
        System.out.println("Database Dao => findFinancialMonthSummary");
        return new FinancialMonthSummary();
    }
}
