package org.spring.cert.definitions.configuration.level.writer;


import org.spring.cert.definitions.configuration.level.ds.FinancialMonthSummary;
import org.spring.cert.definitions.configuration.level.ds.FinancialQuarterSummary;
import org.spring.cert.definitions.configuration.level.ds.FinancialYearSummary;

public interface FinancialReportWriter {
    void appendFreeText(String title);

    void appendFinancialYearSummary(FinancialYearSummary financialYearSummary);

    void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary);

    void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary);
}
