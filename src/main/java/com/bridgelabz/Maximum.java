package com.bridgelabz;

public class Maximum {

    public Integer findmax(Integer firstPosition,Integer secondPosition,Integer thirdPosition){
        Integer max=firstPosition;

        if(secondPosition.compareTo(max)>0){
            max=secondPosition;
        }
        if(thirdPosition.compareTo(max)>0){
            max=thirdPosition;
        }

            return max;
    }
}