package org.training.advanced.java.multithread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

public class CounterThread extends Thread {

    public static volatile long           counter = 0;
    // public static AtomicLong counter = new AtomicLong();
    // public static long counter2 = 0;
    private                CountDownLatch countDownLatch;
    private static         ReentrantLock  lock    = new ReentrantLock();

    public CounterThread(CountDownLatch countDownLatchParam) {
        countDownLatch = countDownLatchParam;
    }

    public static synchronized void increase() {
        // counter++;
    }

    public static void increase2() {
        lock.lock();

        try {
            counter++;
        } catch (Exception eParam) {
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            // counter.incrementAndGet();
            if (interrupted()) {
                return;
            }
            counter++;
            // increase();
            // increase2();
        }
        countDownLatch.countDown();
    }
}
