package com.bootcoding.leetcode;

import java.util.*;

public class InorderBinaryTree {
    public static void main(String[] args) {

    }
    List<Integer> v = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return v;
        }
        inorderTraversal(root.left);
        v.add(root.val);
        inorderTraversal(root.right);
        return v;
    }
}
