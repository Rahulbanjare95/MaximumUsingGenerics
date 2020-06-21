package com.bridgelabz;

public class Maximum {

    public  static <E extends Comparable<E>> E maximumFinder(E firstPosition,E secondPosition,E thirdPosition){
        E max=firstPosition;
        if(secondPosition.compareTo(max)>0){
            max=secondPosition;
        }
        if(thirdPosition.compareTo(max)>0){
            max=thirdPosition;
        }
        return max;
    }

}