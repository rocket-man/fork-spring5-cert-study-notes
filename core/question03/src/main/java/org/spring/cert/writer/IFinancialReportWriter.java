package org.spring.cert.writer;

import org.spring.cert.ds.FinancialMonthSummary;
import org.spring.cert.ds.FinancialQuarterSummary;
import org.spring.cert.ds.FinancialYearSummary;

public interface IFinancialReportWriter {
    void appendFreeText(String title);

    void appendFinancialYearSummary(FinancialYearSummary financialYearSummary);

    void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary);

    void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary);
}
