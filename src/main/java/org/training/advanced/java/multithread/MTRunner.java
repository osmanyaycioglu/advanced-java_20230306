package org.training.advanced.java.multithread;

import java.util.concurrent.CountDownLatch;

public class MTRunner {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        long delta = System.currentTimeMillis();
        for (int i = 0; i < 2; i++) {
            CounterThread counterThread = new CounterThread(countDownLatch);
            counterThread.start();
        }

        try {
            countDownLatch.await();
            System.out.println("counter : " + CounterThread.counter + " Delta : " + (System.currentTimeMillis()
                                                                                     - delta));
        } catch (InterruptedException eParam) {
            throw new RuntimeException(eParam);
        }

    }
}
