package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean balanced = isBalanced(new ValidateBinarySearchTree98.TreeNode(1, new ValidateBinarySearchTree98.TreeNode(2,
                new ValidateBinarySearchTree98.TreeNode(3, new ValidateBinarySearchTree98.TreeNode(4), new ValidateBinarySearchTree98.TreeNode(4)),
                new ValidateBinarySearchTree98.TreeNode(3)), new ValidateBinarySearchTree98.TreeNode(2)));
    }

    public static int[][] findNClosestPoints(int[][] points, int n) {
        int[] diffArr = new int[points.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];

            int sumWithoutScrt = x1 * x1 + y1 * y1;
            diffArr[i] = sumWithoutScrt;
            map.put(sumWithoutScrt, i);

        }

        Arrays.sort(diffArr);

        int[][] result = new int[n][2];

        for (int i = 0; i < n; i++) {
            result[i] = points[map.get(diffArr[i])];
        }

        return result;
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