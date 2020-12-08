package org.spring.cert.definitions.bean.method.level.writer;

import org.spring.cert.definitions.bean.method.level.ds.FinancialMonthSummary;
import org.spring.cert.definitions.bean.method.level.ds.FinancialQuarterSummary;
import org.spring.cert.definitions.bean.method.level.ds.FinancialYearSummary;

public class DatabaseStoreFinancialReportWriter implements FinancialReportWriter {
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
