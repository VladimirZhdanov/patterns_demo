package com.homel.singleton;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingletonTest {
    ExecutorService executor = Executors.newFixedThreadPool(10);

    @Test
    void shouldReturnPnlAndMarkWhenPutPnlAndMark() throws InterruptedException {
        Singleton singleton = Singleton.getInstance();

        List<Callable<Singleton>> tasks = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            tasks.add(Singleton::getInstance);
        }

        List<Future<Singleton>> futures = executor.invokeAll(tasks);

        List<Singleton> result = futures.stream().map(it -> {
            try {
                return it.get(200, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());

        result.forEach(it -> assertEquals(singleton, it));
    }

}