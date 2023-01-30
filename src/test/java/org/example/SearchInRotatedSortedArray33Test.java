package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArray33Test {

    private final SearchInRotatedSortedArray33 searchInRotatedSortedArray33 = new SearchInRotatedSortedArray33();

    @Test
    void test1() {

        int search = searchInRotatedSortedArray33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
       // int search2 = searchInRotatedSortedArray33.search(new int[]{1,3}, 3);
        Assertions.assertEquals(search, 4);
     //   Assertions.assertEquals(search2, 1);

    }

}