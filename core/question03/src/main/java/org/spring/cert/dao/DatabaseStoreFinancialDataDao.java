package org.spring.cert.dao;

import org.spring.cert.ds.FinancialMonthSummary;
import org.spring.cert.ds.FinancialQuarterSummary;
import org.spring.cert.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component("database-dao")
class DatabaseStoreFinancialDataDao implements IFinancialDataDao {
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
