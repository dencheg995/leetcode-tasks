package org.example;

/**
 * Solution for https://leetcode.com/problems/validate-binary-search-tree/
 */
public class ValidateBinarySearchTree98 {

    public boolean isValidBST(TreeNode root) {
        boolean isValid = true;
        return searchingTree(root, null, null, isValid);

    }

    private boolean searchingTree(TreeNode root, Integer low, Integer high, boolean isValid) {
        if (root == null) {
            return isValid;
        }


        if (low != null && root.val <= low) {
            return false;
        }


        if (high != null && root.val >= high) {
            return false;
        }

        return searchingTree(root.left, low, root.val, isValid) && searchingTree(root.right, root.val, high, isValid);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
