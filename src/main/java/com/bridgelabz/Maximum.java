package com.bridgelabz;
import java.util.Arrays;
public class Maximum<E > {
    public E maximumFinder(E... options) {
        Arrays.sort(options);
        E max = options[options.length - 1];
        printMax(max);
        return max;
    }
    private void printMax(E max) {
        System.out.println(max);
    }
}