package com.bridgelabz;

import java.util.Comparator;

public class Maximum <E extends Comparable <E>> {

    E firstPosition;
    E secondPosition;
    E thirdPosition;

    public Maximum(E firstPosition, E secondPosition, E thirdPosition) {
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
        this.thirdPosition = thirdPosition;
    }

    public E maximummethod(){
        return Maximum.maximumFinder(firstPosition,secondPosition,thirdPosition);
    }

    public static  <E extends Comparable<E>> E maximumFinder(E firstPosition, E secondPosition, E thirdPosition) {
        E max=firstPosition;
        if(secondPosition.compareTo(max)>0){
            max=secondPosition;
        }
        if(thirdPosition.compareTo(max)>0){
            max=thirdPosition;
        }
        return max;
    }


  /*  public  static <E extends Comparable<E>> E maximumFinder(E firstPosition, E secondPosition, E thirdPosition){
        E max=firstPosition;
        if(secondPosition.compareTo(max)>0){
            max=secondPosition;
        }
        if(thirdPosition.compareTo(max)>0){
            max=thirdPosition;
        }
        return max;
    }
*/
}