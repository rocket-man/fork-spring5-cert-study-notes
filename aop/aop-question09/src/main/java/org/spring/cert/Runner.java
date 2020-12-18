package org.spring.cert;

import org.spring.cert.beans.TransactionHistoryServiceClient;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();

        TransactionHistoryServiceClient bean = context.getBean(TransactionHistoryServiceClient.class);

        bean.saveTransactionData(
                "A001",
                "amount=50",
                "private-key-5232");


    }
}
