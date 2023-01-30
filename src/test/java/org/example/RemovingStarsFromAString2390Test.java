package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RemovingStarsFromAString2390Test {

    private final RemovingStarsFromAString2390 removingStarsFromAString2390 = new RemovingStarsFromAString2390();


    @Test
    void test1() {

        String s = removingStarsFromAString2390.removeStars("erase*****");
        assertTrue(s.isEmpty());
        s = removingStarsFromAString2390.removeStars2("leet**cod*e");
        assertEquals("lecoe", s);
        s = removingStarsFromAString2390.removeStars3("leet**cod*e");
        assertEquals("lecoe", s);
    }

}