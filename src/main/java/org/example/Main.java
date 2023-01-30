package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean balanced = isBalanced(new ValidateBinarySearchTree98.TreeNode(1, new ValidateBinarySearchTree98.TreeNode(2,
                new ValidateBinarySearchTree98.TreeNode(3, new ValidateBinarySearchTree98.TreeNode(4), new ValidateBinarySearchTree98.TreeNode(4)),
                new ValidateBinarySearchTree98.TreeNode(3)), new ValidateBinarySearchTree98.TreeNode(2)));
    }

    public static boolean isBalanced(ValidateBinarySearchTree98.TreeNode root) {
        if (root == null) {
            return true;
        }

        int leftDepth = countDepth(root.left);
        int rightDepth = countDepth(root.right);

        int diff = 0;
        if (leftDepth > rightDepth) {
            diff = leftDepth - rightDepth;
        } else {
            diff = rightDepth - leftDepth;
        }

        return diff <= 1;

    }

    private static int countDepth(ValidateBinarySearchTree98.TreeNode root) {

        if (root == null)
            return 0;

        int left = countDepth(root.left);
        countDepth(root.right);

        return left + 1;

    }
}