package com.bridgelabz;

public class Maximum {

    public Integer findMaxInteger(Integer firstPosition,Integer secondPosition,Integer thirdPosition){
        Integer max=firstPosition;

        if(secondPosition.compareTo(max)>0){
            max=secondPosition;
        }
        if(thirdPosition.compareTo(max)>0){
            max=thirdPosition;
        }

            return max;
    }


    public Double findMaxDouble(Double firstPosition, Double secondPosition, Double thirdPosition) {
        Double maxDouble = firstPosition;
        if (secondPosition.compareTo(maxDouble) > 0) {
            maxDouble = secondPosition;
        }
        if (thirdPosition.compareTo(maxDouble) > 0) {
            maxDouble = thirdPosition;

        }
        return maxDouble;
    }
    public String findMaxString(String firsposition,String secondPosition, String thirdPosition){
        String maxString=firsposition;
        if(secondPosition.compareTo(maxString)>0){
            maxString=secondPosition;
        }
        if(thirdPosition.compareTo(maxString)>0){
            maxString=thirdPosition;
        }
        return maxString;
    }
}