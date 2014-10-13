package com.gmail.krvmax.multithreading;

import java.util.Arrays;
import java.util.Random;

/**
 * author: Maxim Diland
 */
public class ArrayUtil {

    public static void main(String[] args) {
        int[] arr = {2343, 45, 56,876,76,345,635,345};

        sort(arr, 0, 4);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arrayToSort, int from, int to) {
        for (int i = from; i < to; i++) {
            moveBubble(arrayToSort, from, to);
        }
    }

    private static void moveBubble(int[] array, int from, int to) {
        for (int i = from; i < to - 1 ; i++) {
            if (array[i] > array[i + 1]) {
                swapElements(array, i, i + 1);
            }
        }
    }

    private static void swapElements(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static int[] generateArray(int length, int maxValue) {
        Random random = new Random();
        int[] generatedArray = new int[length];
        for (int i = 0; i < generatedArray.length; i++) {
            generatedArray[i] = random.nextInt(maxValue);
        }

        return generatedArray;
    }

    public static int[] copyArray(int[] arrayToCopy) {
        int[] copiedArray = new int[arrayToCopy.length];
        System.arraycopy(arrayToCopy, 0, copiedArray, 0, arrayToCopy.length);
        return copiedArray;
    }

}
