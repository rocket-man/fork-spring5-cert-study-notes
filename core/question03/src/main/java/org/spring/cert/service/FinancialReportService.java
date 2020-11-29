package org.spring.cert.service;

import org.spring.cert.dao.IFinancialDataDao;
import org.spring.cert.ds.FinancialMonthSummary;
import org.spring.cert.ds.FinancialQuarterSummary;
import org.spring.cert.ds.FinancialYearSummary;
import org.spring.cert.writer.IFinancialReportWriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FinancialReportService {

    private final IFinancialDataDao financialDataDao;
    private final IFinancialReportWriter financialReportWriter;

    public FinancialReportService(@Qualifier("database-dao") IFinancialDataDao financialDataDao, @Qualifier("database-writer") IFinancialReportWriter financialReportWriter) {
        this.financialDataDao = financialDataDao;
        this.financialReportWriter = financialReportWriter;
    }

    public void generateReport() {
        FinancialYearSummary financialYearSummary = financialDataDao.findFinancialYearSummary(2019);
        FinancialQuarterSummary financialQuarterSummary = financialDataDao.findFinancialQuarterSummary(2019, 1);
        FinancialMonthSummary financialMonthSummary = financialDataDao.findFinancialMonthSummary(2019, 4);

        financialReportWriter.appendFreeText("Year / Quarter / Month Financial Report");
        financialReportWriter.appendFinancialYearSummary(financialYearSummary);
        financialReportWriter.appendFinancialQuarterSummary(financialQuarterSummary);
        financialReportWriter.appendFinancialMonthSummary(financialMonthSummary);
    }
}
