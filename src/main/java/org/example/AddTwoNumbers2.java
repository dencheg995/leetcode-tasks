package org.example;

import java.util.Objects;

/**
 * Solution for https://leetcode.com/problems/add-two-numbers/
 * <p>
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode();
        ListNode pointer = dummy;

        // it's number after sum (9+4 = 10), carry = 1 for next sum;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            //take last number from sum
            pointer.next = new ListNode(sum % 10);

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

            pointer = pointer.next;
        }

        if (carry > 0) {
            pointer.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static class ListNode {

        final int val;
        ListNode next;

        public ListNode() {
            val = 0;
            next = null;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }

}
