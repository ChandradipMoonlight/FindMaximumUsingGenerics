package com.maxtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxNumTest {
    MaxNum maxNum = new MaxNum();

    // Test cases for integer to check max Numver
    @Test
    public void givenMaxIntegerNumAtFirstPosition_ShouldReturnSameNum() {
        Integer maximumNum = maxNum.testMax(4, 5, 3);
        Assertions.assertEquals(4, maximumNum);
    }

    @Test
    public void givenMaxIntegerNumAtSecondPosition_ShouldReturnSameNum() {
        Integer maximumNum = maxNum.testMax(4, 5, 3);
        Assertions.assertEquals(5, maximumNum);
    }

    @Test
    public void givenMaxIntegerNumAtThirdPosition_ShouldReturnSameNum() {
        Integer maximumNum = maxNum.testMax(4, 5, 3);
        Assertions.assertEquals(3, maximumNum);
    }

    // test cases for float number to check max number.
    @Test
    public void givenMaxFloatNumAtFirstPosition_ShouldReturnSameNum() {
        Float maximumNum = maxNum.testMax(10.5f, 12.6f, 13.01f);
        Assertions.assertEquals(10.5f, maximumNum);
    }

    @Test
    public void givenMaxFloatNumAtSecondPosition_ShouldReturnSameNum() {
        Float maximumNum = maxNum.testMax(10.5f, 12.6f, 13.01f);
        Assertions.assertEquals(12.6f, maximumNum);
    }
    @Test
    public void givenMaxFloatNumAtThirdPosition_ShouldReturnSameNum() {
        Float maximumNum = maxNum.testMax(10.5f, 12.6f, 13.01f);
        Assertions.assertEquals(13.01f, maximumNum);
    }
}
