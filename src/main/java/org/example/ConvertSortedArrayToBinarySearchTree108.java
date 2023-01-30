package org.example;

/**
 * Solution for https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class ConvertSortedArrayToBinarySearchTree108 {

    public ValidateBinarySearchTree98.TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private ValidateBinarySearchTree98.TreeNode sortedArrayToBST(int[] nums, int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;

        ValidateBinarySearchTree98.TreeNode node = new ValidateBinarySearchTree98.TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, start, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, end);

        return node;

    }


}
