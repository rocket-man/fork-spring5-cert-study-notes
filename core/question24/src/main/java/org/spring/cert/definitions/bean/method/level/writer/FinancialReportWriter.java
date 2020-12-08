package org.spring.cert.definitions.bean.method.level.writer;


import org.spring.cert.definitions.bean.method.level.ds.FinancialMonthSummary;
import org.spring.cert.definitions.bean.method.level.ds.FinancialQuarterSummary;
import org.spring.cert.definitions.bean.method.level.ds.FinancialYearSummary;

public interface FinancialReportWriter {
    void appendFreeText(String title);

    void appendFinancialYearSummary(FinancialYearSummary financialYearSummary);

    void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary);

    void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary);
}
