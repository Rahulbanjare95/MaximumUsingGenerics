package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
public class MaximumTest {
    Maximum maximum=new Maximum();
    @Test
    public void givenMaxAtFirst_ShouldReturnFirstNumber (){
        Assert.assertEquals(80,(int)maximum.maximumFinder(80,20,50,40));
    }
    @Test
    public void givenMaxAtSecond_ShouldReturnSecondNumber (){
        Assert.assertEquals(80,(int)maximum.maximumFinder(20,80,50,40));
    }
    @Test
    public void givenMaxAtThird_ShouldReturnThirdNumber (){
        Assert.assertEquals(80,(int)maximum.maximumFinder(20,50,80,40));
    }
    @Test
    public void givenMaxDouble_AtFirst_shouldReturnFirstNumber(){
        Assert.assertEquals((Double) 5.6,maximum.maximumFinder(5.6,2.5,0.5));
    }
    @Test
    public void givenMaxDouble_AtSecond_shouldReturnSecondNumber() {
        Assert.assertEquals((Double)5.6,maximum.maximumFinder(2.5,5.6,0.5));
    }
    @Test
    public void givenMaxDouble_AtThird_shouldReturnThirdNumber() {
        Assert.assertEquals( (Double)5.6,maximum.maximumFinder(0.5,2.5,5.6));
    }
    @Test
    public void givenMaxString_AtFirstPosition_ShouldReturnFirstString(){
        Assert.assertEquals("Peach",maximum.maximumFinder("Peach","Banana","Apple"));
    }
    @Test
    public void givenMaxString_AtSecondPosition_ShouldReturnSecondString(){
        Assert.assertEquals("Swift",maximum.maximumFinder("Java","Swift","Python"));
    }
    @Test
    public void givenMaxString_AtThirdPosition_ShouldReturnThirdString(){
        Assert.assertEquals( "Medicine",maximum.maximumFinder("Engineering","Commerce","Medicine"));
    }
}
