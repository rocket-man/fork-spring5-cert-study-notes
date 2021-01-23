package org.spring.cert.service;

import org.spring.cert.ds.Customer;
import org.spring.cert.ds.Statistics;
import org.springframework.stereotype.Service;

@Service
public class CustomerStatisticsService {

    public Statistics calculcateStatistics(Customer customer) {
        int codeLength = customer.getCode().length();
        int firstNameLength = customer.getFirstName().length();
        int lastNameLength = customer.getLastName().length();

        return new Statistics(
                codeLength + firstNameLength + lastNameLength,
                codeLength, firstNameLength, lastNameLength
        );
    }
}
