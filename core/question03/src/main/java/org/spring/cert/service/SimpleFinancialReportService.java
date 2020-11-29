package org.spring.cert.service;

import org.spring.cert.dao.IFinancialDataDao;
import org.spring.cert.ds.FinancialYearSummary;
import org.spring.cert.writer.IFinancialReportWriter;

class SimpleFinancialReportService {
    private final IFinancialDataDao financialDataDao;
    private final IFinancialReportWriter financialReportWriter;

    SimpleFinancialReportService(IFinancialDataDao financialDataDao, IFinancialReportWriter financialReportWriter) {
        this.financialDataDao = financialDataDao;
        this.financialReportWriter = financialReportWriter;
    }

    void generateReport() {
        FinancialYearSummary financialYearSummary = financialDataDao.findFinancialYearSummary(2019);

        financialReportWriter.appendFinancialYearSummary(financialYearSummary);
    }
}
