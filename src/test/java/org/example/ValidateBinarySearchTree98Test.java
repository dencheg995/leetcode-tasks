package org.example;

import org.junit.jupiter.api.Test;

import static org.example.ValidateBinarySearchTree98.TreeNode;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateBinarySearchTree98Test {

    private final ValidateBinarySearchTree98 validateBinarySearchTree98 = new ValidateBinarySearchTree98();

    @Test
    void test1() {

        TreeNode treeNode
                = new TreeNode(5, new TreeNode(1, null, null), new TreeNode(4, new TreeNode(3), new TreeNode(6)));

        boolean validBST = validateBinarySearchTree98.isValidBST(treeNode);
        assertFalse(validBST);

        TreeNode treeNode1
                = new TreeNode(5, new TreeNode(4, null, null), new TreeNode(6, new TreeNode(5), new TreeNode(7)));

        boolean validBST1 = validateBinarySearchTree98.isValidBST(treeNode1);
        assertFalse(validBST1);

        TreeNode treeNode2
                = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(4, null, null));

        boolean validBST2 = validateBinarySearchTree98.isValidBST(treeNode2);
        assertTrue(validBST2);

    }
}