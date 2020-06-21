package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class MaximumTest {
    @Test
    public void givenMaxAtFirst_ShouldReturnFirstNumber (){
        Maximum maximum=new Maximum();
        Integer highest=maximum.maximumFinder(20,15,10);
        Assert.assertEquals(20,(int)highest);

    }
    @Test
    public void givenMaxAtSecond_ShouldReturnSecondNumber (){
        Maximum maximum=new Maximum();
        Integer highest=maximum.maximumFinder(5,15,10);
        Assert.assertEquals(15,(int)highest);

    }
    @Test
    public void givenMaxAtThird_ShouldReturnThirdNumber (){
        Maximum maximum=new Maximum();
        Integer highest=maximum.maximumFinder(5,15,50);
        Assert.assertEquals(50,(int)highest);

    }
    @Test
    public void givenMaxDouble_AtFirst_shouldReturnFirstNumber(){
        Maximum maximum=new Maximum();
        Double highest=maximum.maximumFinder(5.6,2.5,0.5);
        Assert.assertEquals((Double) 5.6,highest);
    }
    @Test
    public void givenMaxDouble_AtSecond_shouldReturnSecondNumber() {
        Maximum maximum = new Maximum();
        Double highest = maximum.maximumFinder(43.45, 125.56, 65.78);
        Assert.assertEquals((Double) 125.56, highest);
    }
    @Test
    public void givenMaxDouble_AtThird_shouldReturnThirdNumber() {
        Maximum maximum = new Maximum();
        Double highest = maximum.maximumFinder(0.1, 0.2, 0.3);
        Assert.assertEquals((Double) 0.3, highest);
    }

    @Test
    public void givenMaxString_AtFirstPosition_ShoulReturnFirstString(){
        Maximum maximum=new Maximum();
        String highest=maximum.maximumFinder("Peach","Banana","Apple");
        Assert.assertEquals("Peach",highest);
    }

    @Test
    public void givenMaxString_AtSecondPosition_ShoulReturnSecondString(){
        Maximum maximum=new Maximum();
        String highest=maximum.maximumFinder("Java","Swift","Python");
        Assert.assertEquals("Swift",highest);
    }
    @Test
    public void givenMaxString_AtThirdPosition_ShoulReturnThirdString(){
        Maximum maximum=new Maximum();
        String highest=maximum.maximumFinder("Engineering","Commerce","Medicine");
        Assert.assertEquals("Medicine",highest);
    }


}

