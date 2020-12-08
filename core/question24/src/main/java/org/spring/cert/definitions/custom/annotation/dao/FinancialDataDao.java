package org.spring.cert.definitions.custom.annotation.dao;


import org.spring.cert.definitions.custom.annotation.ds.FinancialMonthSummary;
import org.spring.cert.definitions.custom.annotation.ds.FinancialQuarterSummary;
import org.spring.cert.definitions.custom.annotation.ds.FinancialYearSummary;

public interface FinancialDataDao {
    FinancialYearSummary findFinancialYearSummary(int year);

    FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter);

    FinancialMonthSummary findFinancialMonthSummary(int year, int month);
}
