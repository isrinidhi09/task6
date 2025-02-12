package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testAddition() {
        int result = 2 + 3;
        Assert.assertEquals(result, 5, "2 + 3 should be 5");
    }
}
