package org.spring.cert.ds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class CustomerStatistics {

    private Customer customer;
    private Statistics statistics;
}
