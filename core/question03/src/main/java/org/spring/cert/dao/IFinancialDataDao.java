package org.spring.cert.dao;

import org.spring.cert.ds.FinancialMonthSummary;
import org.spring.cert.ds.FinancialQuarterSummary;
import org.spring.cert.ds.FinancialYearSummary;

public interface IFinancialDataDao {
    FinancialYearSummary findFinancialYearSummary(int year);

    FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter);

    FinancialMonthSummary findFinancialMonthSummary(int year, int month);

}
