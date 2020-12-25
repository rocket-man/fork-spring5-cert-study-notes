package org.spring.cert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.spring.cert.util.CountDownLatchUtil.await;
import static org.spring.cert.util.CountDownLatchUtil.countDown;


@Component
public class TransactionIsolationExampleInvoker {
    @Autowired
    private TransactionIsolationExample transactionIsolationExample;

    private ExecutorService executorService = Executors.newFixedThreadPool(2);

    public void execute() {
        System.out.println("Starting Repeatable Read Example");

        executorService.execute(() -> {
            try {
                transactionIsolationExample.readOperations();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            transactionIsolationExample.nextReadOperation();

            countDown(transactionIsolationExample.getReadWriteLatch());
        });

        executorService.execute(() -> {
            try {
                transactionIsolationExample.writeOperations();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDown(transactionIsolationExample.getWriteDoneAndCommittedLatch());

            countDown(transactionIsolationExample.getReadWriteLatch());
        });

        await(transactionIsolationExample.getReadWriteLatch());

        executorService.shutdown();

        System.out.println("Finishing Repeatable Read Example");
    }
}
