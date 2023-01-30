package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearch704Test {

    private final BinarySearch704 binarySearch704 = new BinarySearch704();

    @Test
    void test1() {

        int search1 = binarySearch704.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        int search2 = binarySearch704.search(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        Assertions.assertEquals(4, search1);
        Assertions.assertEquals(-1, search2);

    }

}