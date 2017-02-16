package me.zhiyong.aigo.examples.algo.tree;

import java.util.Stack;

/**
 * Created by afanty on 17-2-15.
 */
public class Tree {

    public static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int value;
        public boolean visited;

        public TreeNode(int value, TreeNode left, TreeNode right) {
            this.left = left;
            this.right = right;
            this.value = value;
        }
    }

    public static void previous(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode tmp = stack.pop();
            if (tmp.right != null) {
                stack.push(tmp.right);
            }
            if (tmp.left != null) {
                stack.push(tmp.left);
            }
            System.out.println(tmp.value);
        }

    }

    public static void middle(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode tmp = stack.pop();
            if (tmp.visited) {
                System.out.println(tmp.value);
                continue;
            }
            tmp.visited = true;
            if (tmp.right != null) {
                stack.push(tmp.right);
            }
            stack.push(tmp);
            if (tmp.left != null) {
                stack.push(tmp.left);
            }
            if (tmp.left == null && tmp.right == null) {
                stack.pop();
                System.out.println(tmp.value);
            }
        }
    }

    public static void last(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode tmp = stack.pop();
            if (tmp.visited) {
                System.out.println(tmp.value);
                continue;
            }
            tmp.visited = true;
            stack.push(tmp);
            if (tmp.right != null) {
                stack.push(tmp.right);
            }
            if (tmp.left != null) {
                stack.push(tmp.left);
            }
            if (tmp.left == null && tmp.right == null) {
                stack.pop();
                System.out.println(tmp.value);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, null);
        root.left = new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null));
        root.right = new TreeNode(3, null, null);
        previous(root);
        System.out.println("======");
        root = new TreeNode(1, null, null);
        root.left = new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null));
        root.right = new TreeNode(3, null, null);
        middle(root);
        System.out.println("=========");
        root = new TreeNode(1, null, null);
        root.left = new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null));
        root.right = new TreeNode(3, null, null);
        last(root);
    }
}
