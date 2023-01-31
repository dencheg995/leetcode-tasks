package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfIslands200Test {


    private final NumberOfIslands200 numberOfIslands200 = new NumberOfIslands200();

    @Test
    void test1() {
        int i = numberOfIslands200.numIslands(new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        });
        assertEquals(1, i);

        int j = numberOfIslands200.numIslands(new char[][]{
                {'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}
        });
        assertEquals(3, j);

        int k = numberOfIslands200.numIslands(new char[][]{
                {'0', '1', '0'},
                {'1', '0', '1'},
                {'0', '1', '0'}
        });

        assertEquals(4, k);
    }

}