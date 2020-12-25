package org.spring.cert.util;

import lombok.SneakyThrows;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchUtil {
    public static void countDown(CountDownLatch countDownLatch) {
        countDownLatch.countDown();
    }

    @SneakyThrows
    public static void await(CountDownLatch countDownLatch) throws InterruptedException {
        countDownLatch.await(10, TimeUnit.SECONDS);
    }
}
