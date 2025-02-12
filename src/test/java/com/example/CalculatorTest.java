package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(5, 3);
        Assert.assertEquals(result, 8, "Addition result is incorrect");
    }
}
