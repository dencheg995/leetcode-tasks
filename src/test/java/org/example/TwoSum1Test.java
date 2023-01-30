package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoSum1Test {

    private final TwoSum1 twoSum1 = new TwoSum1();

    @Test
    void test1() {
        assertTrue(Arrays.compare(new int[]{0, 1}, twoSum1.twoSum(new int[]{2, 7, 11, 15}, 9)) == 0);
    }

}