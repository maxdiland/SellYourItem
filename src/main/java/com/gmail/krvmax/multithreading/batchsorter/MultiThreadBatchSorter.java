package com.gmail.krvmax.multithreading.batchsorter;

import com.gmail.krvmax.multithreading.ArrayUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * author: Maxim Diland
 */
public class MultiThreadBatchSorter implements BatchSorter {
    @Override
    public void sort(int[]... arrays) {
        ExecutorService executorService = Executors.newFixedThreadPool(Integer.MAX_VALUE);

        for (final int[] array : arrays) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    ArrayUtil.sort(array, 0, array.length);
                }
            });
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
