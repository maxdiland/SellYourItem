package com.gmail.krvmax.multithreading.batchsorter;


import com.gmail.krvmax.multithreading.ArrayUtil;

/**
 * author: Maxim Diland
 */
public class SequentialBatchSorter implements BatchSorter {
    @Override
    public void sort(int[]... arrays) {
        for (int[] array : arrays) {
            ArrayUtil.sort(array, 0, array.length);
        }
    }
}
