package com.bridgelabz;

public class Maximum {

        public Integer findmax(Integer firsPosition,Integer secondPosition,Integer thirdPosition){
        Integer max=firsPosition;

        if(secondPosition.compareTo(max)>0){
            return secondPosition;
        }
        if(thirdPosition.compareTo(max)>0){
            return thirdPosition;
        }
        else
            return max;
    }
}
