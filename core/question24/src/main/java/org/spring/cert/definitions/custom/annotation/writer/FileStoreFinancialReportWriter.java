package org.spring.cert.definitions.custom.annotation.writer;

import org.spring.cert.definitions.custom.annotation.annotations.FileProfile;
import org.spring.cert.definitions.custom.annotation.ds.FinancialMonthSummary;
import org.spring.cert.definitions.custom.annotation.ds.FinancialQuarterSummary;
import org.spring.cert.definitions.custom.annotation.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component
@FileProfile
public class FileStoreFinancialReportWriter implements FinancialReportWriter {
    @Override
    public void appendFreeText(String title) {
        System.out.println("File Writer => appendFreeText");
    }

    @Override
    public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
        System.out.println("File Writer => appendFinancialYearSummary");
    }

    @Override
    public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
        System.out.println("File Writer => appendFinancialQuarterSummary");
    }

    @Override
    public void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary) {
        System.out.println("File Writer => appendFinancialMonthSummary");
    }
}
