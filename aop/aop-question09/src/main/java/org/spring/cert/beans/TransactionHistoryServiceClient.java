package org.spring.cert.beans;

import org.spring.cert.annotations.Sanitize;
import org.springframework.stereotype.Component;

@Component
public class TransactionHistoryServiceClient {

    public void saveTransactionData(@Sanitize String identifier, String data, @Sanitize String privateKey) {
        System.out.println(
                String.format(
                        "Sending data, identifier = [%s], data = [%s], privateKey = [%s]",
                        identifier, data, privateKey
                )
        );
    }
}
