package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbers2Test {

    private final AddTwoNumbers2 addTwoNumbers2 = new AddTwoNumbers2();

    @Test
    void test1() {
        AddTwoNumbers2.ListNode l1 = new AddTwoNumbers2.ListNode(2, new AddTwoNumbers2.ListNode(4, new AddTwoNumbers2.ListNode(3)));
        AddTwoNumbers2.ListNode l2 = new AddTwoNumbers2.ListNode(5, new AddTwoNumbers2.ListNode(6, new AddTwoNumbers2.ListNode(4)));

        AddTwoNumbers2.ListNode result = addTwoNumbers2.addTwoNumbers(l1, l2);
        assertEquals(result, new AddTwoNumbers2.ListNode(7, new AddTwoNumbers2.ListNode(0, new AddTwoNumbers2.ListNode(8))));
    }

    @Test
    void test2() {

        AddTwoNumbers2.ListNode l1 = new AddTwoNumbers2.ListNode(0);
        AddTwoNumbers2.ListNode l2 = new AddTwoNumbers2.ListNode(0);

        AddTwoNumbers2.ListNode result = addTwoNumbers2.addTwoNumbers(l1, l2);
        assertEquals(result, new AddTwoNumbers2.ListNode(0));
    }

}