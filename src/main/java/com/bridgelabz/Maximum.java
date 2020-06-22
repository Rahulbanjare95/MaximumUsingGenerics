package com.bridgelabz;

import java.util.Arrays;

public class Maximum {

    public static <E extends Comparable<E>> E maximumFinder(E[] array) {
        Arrays.sort(array);
        E max = array[array.length - 1];
        return max;
    }
}