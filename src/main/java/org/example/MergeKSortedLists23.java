package org.example;

/**
 * Solution for https://leetcode.com/problems/merge-k-sorted-lists/
 *
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * merging them into one sorted list:
 * 1->1->2->3->4->4->5->6
 */
public class MergeKSortedLists23 {

    public AddTwoNumbers2.ListNode mergeKLists(AddTwoNumbers2.ListNode[] lists) {

        if (lists.length == 1) {
            return lists[0];
        }

        AddTwoNumbers2.ListNode pointer = null;

        for (int i = 0; i < lists.length; i++) {
            pointer = mergeTwoList(pointer, lists[i]);
        }

        return pointer;

    }

    private AddTwoNumbers2.ListNode mergeTwoList(AddTwoNumbers2.ListNode l1, AddTwoNumbers2.ListNode l2) {

        AddTwoNumbers2.ListNode dummy = new AddTwoNumbers2.ListNode();
        AddTwoNumbers2.ListNode pointer = dummy;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                pointer.next = l1;
                l1 = l1.next;
            } else {
                pointer.next = l2;
                l2 = l2.next;
            }

            pointer = pointer.next;
        }

        if (l1 != null) {
            pointer.next = l1;
        }

        if (l2 != null) {
            pointer.next = l2;
        }

        return dummy.next;

    }

}
