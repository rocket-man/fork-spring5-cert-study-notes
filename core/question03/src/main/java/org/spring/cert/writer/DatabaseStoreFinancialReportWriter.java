package org.spring.cert.writer;

import org.spring.cert.ds.FinancialMonthSummary;
import org.spring.cert.ds.FinancialQuarterSummary;
import org.spring.cert.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component("database-writer")
class DatabaseStoreFinancialReportWriter implements IFinancialReportWriter {
    @Override
    public void appendFreeText(String title) {
        System.out.println("Database Writer => appendFreeText");
    }

    @Override
    public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
        System.out.println("Database Writer => appendFinancialYearSummary");
    }

    @Override
    public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
        System.out.println("Database Writer => appendFinancialQuarterSummary");
    }

    @Override
    public void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary) {
        System.out.println("Database Writer => appendFinancialMonthSummary");
    }
}
