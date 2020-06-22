package com.bridgelabz;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Maximum<E> {
    E[] array;
    public static  <E extends Comparable<E>> E maximumFinder(E[] array) {
        Arrays.sort(array);
        E max = array[array.length - 1];
        printMax(max);
        return max;
    }
    private static <E extends Comparable<E>> void printMax(E max) {
        System.out.println(max);
    }

}