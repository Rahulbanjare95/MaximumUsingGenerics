package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenMaxAtFirst_ShouldReturnSameNumber (){
        Maximum maximum=new Maximum();
       Integer highest=maximum.findmax(20,15,10);
        Assert.assertEquals(20,(int)highest);

    }
}
