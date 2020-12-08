package org.spring.cert.definitions.component.level.dao;


import org.spring.cert.definitions.component.level.ds.FinancialMonthSummary;
import org.spring.cert.definitions.component.level.ds.FinancialQuarterSummary;
import org.spring.cert.definitions.component.level.ds.FinancialYearSummary;

public interface FinancialDataDao {
    FinancialYearSummary findFinancialYearSummary(int year);

    FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter);

    FinancialMonthSummary findFinancialMonthSummary(int year, int month);
}
