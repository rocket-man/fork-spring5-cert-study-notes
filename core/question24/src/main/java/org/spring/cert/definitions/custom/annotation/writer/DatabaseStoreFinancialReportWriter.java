package org.spring.cert.definitions.custom.annotation.writer;

import org.spring.cert.definitions.custom.annotation.annotations.DatabaseProfile;
import org.spring.cert.definitions.custom.annotation.ds.FinancialMonthSummary;
import org.spring.cert.definitions.custom.annotation.ds.FinancialQuarterSummary;
import org.spring.cert.definitions.custom.annotation.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component
@DatabaseProfile
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
