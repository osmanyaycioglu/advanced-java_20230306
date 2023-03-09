package org.training.advanced.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;

public class QueueTest1 {
    public static void main(String[] args) {
        Queue<String> strings = new LinkedList<>();
        strings.add("deneme1");
        strings.add("deneme2");
        strings.add("deneme3");
        String peek = strings.peek(); // Silmez

        String poll = strings.poll();

        BlockingQueue<String> stringBlockingQueue = new ArrayBlockingQueue<>(1_000);
        try {
            // String take = stringBlockingQueue.take();
            String take = stringBlockingQueue.poll(2_000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException eParam) {
            throw new RuntimeException(eParam);
        }

        Deque<String> stringDeque = new ArrayDeque<>();
        stringDeque.addFirst("den1");
        String s = stringDeque.pollFirst();

        BlockingDeque<String> stringBlockingDeque = new LinkedBlockingDeque<>();


    }
}
