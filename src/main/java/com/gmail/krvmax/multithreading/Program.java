package com.gmail.krvmax.multithreading;

import com.gmail.krvmax.multithreading.batchsorter.BatchSorter;
import com.gmail.krvmax.multithreading.batchsorter.MultiThreadBatchSorter;
import com.gmail.krvmax.multithreading.batchsorter.SequentialBatchSorter;

/**
 * author: Maxim Diland
 */
public class Program {
    public static void main(String[] args) {
        int[] arrayOne = ArrayUtil.generateArray(50000, 99999);
        int[] arrayTwo = ArrayUtil.generateArray(50000, 99999);
        int[] arrayThree = ArrayUtil.generateArray(50000, 99999);
        int[] arrayFour = ArrayUtil.generateArray(50000, 99999);

        int[] copyArrayOne = ArrayUtil.copyArray(arrayOne);
        int[] copyArrayTwo = ArrayUtil.copyArray(arrayTwo);
        int[] copyArrayThree = ArrayUtil.copyArray(arrayThree);
        int[] copyArrayFour = ArrayUtil.copyArray(arrayFour);

        BatchSorter sequentialSorter = new SequentialBatchSorter();
        BatchSorter multiThreadSorter = new MultiThreadBatchSorter();

        long startTime = System.nanoTime();
        sequentialSorter.sort(arrayOne, arrayTwo, arrayThree, arrayFour);
        System.out.printf("Sequential sorting done! It took %d nanosecs.%n", System.nanoTime() - startTime);

        startTime = System.nanoTime();
        multiThreadSorter.sort(copyArrayOne, copyArrayTwo, copyArrayThree, copyArrayFour);
        System.out.printf("MultiThread sorting done! It took %d nanosecs.%n", System.nanoTime() - startTime);

        if (ArrayUtil.isSorted(arrayOne) && ArrayUtil.isSorted(arrayTwo) && ArrayUtil.isSorted(arrayThree) && ArrayUtil.isSorted(arrayFour)) {
            System.out.println("1. OK!");
        }

        if (ArrayUtil.isSorted(copyArrayOne) && ArrayUtil.isSorted(copyArrayTwo) && ArrayUtil.isSorted(copyArrayThree) && ArrayUtil.isSorted(copyArrayFour)) {
            System.out.println("2. OK!");
        }

    }
}
