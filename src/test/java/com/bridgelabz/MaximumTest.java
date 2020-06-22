package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class MaximumTest {
    @Test
    public void givenMaxAtFirst_ShouldReturnFirstNumber (){
        Maximum maximum=new Maximum();
        Integer []array={80,20,50,40};
        Assert.assertEquals(80,(int)maximum.maximumFinder(array));
    }
    @Test
    public void givenMaxAtSecond_ShouldReturnSecondNumber (){
        Maximum maximum=new Maximum();
        Integer []array={20,80,50,40};
        Assert.assertEquals(80,(int)maximum.maximumFinder(array));
    }
    @Test
    public void givenMaxAtThird_ShouldReturnThirdNumber (){
        Maximum maximum=new Maximum();
        Integer []array={20,50,80,40};
        Assert.assertEquals(80,(int)maximum.maximumFinder(array));

    }
    @Test
    public void givenMaxDouble_AtFirst_shouldReturnFirstNumber(){
        Maximum maximum=new Maximum();
        Double []array={5.6,2.5,0.5};
        Assert.assertEquals((Double) 5.6,maximum.maximumFinder(array));
    }
    @Test
    public void givenMaxDouble_AtSecond_shouldReturnSecondNumber() {
        Maximum maximum = new Maximum();
        Double []array={2.5,5.6,0.5};
        Assert.assertEquals((Double)5.6,maximum.maximumFinder(array));
    }
    @Test
    public void givenMaxDouble_AtThird_shouldReturnThirdNumber() {
        Maximum maximum = new Maximum();
        Double []array={0.5,2.5,5.6};
        Assert.assertEquals( (Double)5.6,maximum.maximumFinder(array));
    }

    @Test
    public void givenMaxString_AtFirstPosition_ShoulReturnFirstString(){
        Maximum maximum=new Maximum();
        String []array={"Peach","Banana","Apple"};
        Assert.assertEquals("Peach",maximum.maximumFinder(array));
    }
    @Test
    public void givenMaxString_AtSecondPosition_ShoulReturnSecondString(){
        Maximum maximum=new Maximum();
        String []array={"Java","Swift","Python"};
        Assert.assertEquals("Swift",maximum.maximumFinder(array));
    }
    @Test
    public void givenMaxString_AtThirdPosition_ShoulReturnThirdString(){
        Maximum maximum=new Maximum();
        String []array={"Engineering","Commerce","Medicine"};
        Assert.assertEquals( "Medicine",maximum.maximumFinder(array));
    }


}

