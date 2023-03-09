package org.training.advanced.java.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        AtomicInteger atomicInteger = new AtomicInteger();
        for (int i = 0; i < 100; i++) {
            executorService.execute(() -> System.out.println(atomicInteger.incrementAndGet() +  "-helloworld " + Thread.currentThread()
                                                                                   .getName()));
        }

        Future<String> futureOp = executorService.submit(() -> {
            System.out.println("Executing future Thread name : " + Thread.currentThread().getName());
            Thread.sleep(5_000);
            return "current counter : " + atomicInteger.get();
        });
        System.out.println("next line : " + Thread.currentThread().getName());
        // Other codes
        try {
            boolean done = futureOp.isDone();
            String s = futureOp.get();
            // String s = futureOp.get(1_000, TimeUnit.MILLISECONDS);
            System.out.println("cevap : " + s + " thread : " + Thread.currentThread().getName());
            System.out.println("before sleep");
            Thread.sleep(10000);
        } catch (Exception eParam) {
            eParam.printStackTrace();
        }
    }
}
