package threads.initial.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    private static final int NUM_THREADS = 5;
    private static final int ENTRIES_PER_THREAD = 100;

    private static final Map<Integer, Integer> map = new ConcurrentHashMap<>();


    private static void insertEntries(int threadId) {
        for (int j = 0; j < ENTRIES_PER_THREAD; j++) {
            map.put(threadId * ENTRIES_PER_THREAD + j, j);
        }
        System.out.println("Thread " + threadId + " completed");
    }


    public static void main(String[] args) {

        Thread[] threads = new Thread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            int threadId = i;
            threads[i] = new Thread(() -> insertEntries(threadId));
            threads[i].start();
        }

        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All threads completed");
        System.out.println("Map size: " + map.size());
    }


}
