package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeKSortedLists23Test {

    private final MergeKSortedLists23 mergeKSortedLists23 = new MergeKSortedLists23();


    @Test
    void test1() {

        AddTwoNumbers2.ListNode[] init = {
                new AddTwoNumbers2.ListNode(1, new AddTwoNumbers2.ListNode(4, new AddTwoNumbers2.ListNode(5))),
                new AddTwoNumbers2.ListNode(1, new AddTwoNumbers2.ListNode(3, new AddTwoNumbers2.ListNode(4))),
                new AddTwoNumbers2.ListNode(2, new AddTwoNumbers2.ListNode(6))
        };
        AddTwoNumbers2.ListNode listNode = mergeKSortedLists23.mergeKLists(init);

        AddTwoNumbers2.ListNode expect = new AddTwoNumbers2.ListNode(1,
                new AddTwoNumbers2.ListNode(1, new AddTwoNumbers2.ListNode(2, new AddTwoNumbers2.ListNode(3,
                        new AddTwoNumbers2.ListNode(4, new AddTwoNumbers2.ListNode(4, new AddTwoNumbers2.ListNode(5, new AddTwoNumbers2.ListNode(6))))))));

        assertEquals(expect, listNode);
    }

}