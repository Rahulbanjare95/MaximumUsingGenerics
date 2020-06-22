package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class MaximumTest {
    @Test
    public void givenMaxAtFirst_ShouldReturnFirstNumber (){
        Maximum maximum=new Maximum(20,15,10);

        Assert.assertEquals(20,maximum.maximummethod());

    }
    @Test
    public void givenMaxAtSecond_ShouldReturnSecondNumber (){
        Maximum maximum=new Maximum(5,15,10);

        Assert.assertEquals(15,maximum.maximummethod());

    }
    @Test
    public void givenMaxAtThird_ShouldReturnThirdNumber (){
        Maximum maximum=new Maximum(5,15,50);

        Assert.assertEquals(50,maximum.maximummethod());

    }
    @Test
    public void givenMaxDouble_AtFirst_shouldReturnFirstNumber(){
        Maximum maximum=new Maximum(5.6,2.5,0.5);

        Assert.assertEquals((Double) 5.6,maximum.maximummethod());
    }
    @Test
    public void givenMaxDouble_AtSecond_shouldReturnSecondNumber() {
        Maximum maximum = new Maximum(43.45, 125.56, 65.78);

        Assert.assertEquals(125.56,maximum.maximummethod());
    }
    @Test
    public void givenMaxDouble_AtThird_shouldReturnThirdNumber() {
        Maximum maximum = new Maximum(0.1, 0.2, 0.3);

        Assert.assertEquals( 0.3, maximum.maximummethod());
    }

    @Test
    public void givenMaxString_AtFirstPosition_ShoulReturnFirstString(){
        Maximum maximum=new Maximum("Peach","Banana","Apple");

        Assert.assertEquals("Peach",maximum.maximummethod());
    }

    @Test
    public void givenMaxString_AtSecondPosition_ShoulReturnSecondString(){
        Maximum maximum=new Maximum("Java","Swift","Python");
        Assert.assertEquals("Swift",maximum.maximummethod());
    }
    @Test
    public void givenMaxString_AtThirdPosition_ShoulReturnThirdString(){
        Maximum maximum=new Maximum("Engineering","Commerce","Medicine");

        Assert.assertEquals("Medicine",maximum.maximummethod());
    }


}

