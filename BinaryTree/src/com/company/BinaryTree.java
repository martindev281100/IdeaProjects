package com.company;

import java.util.TreeMap;

public class BinaryTree {
    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }
    /*
    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(TreeNode node) {
        //base case
        if (node == null) return;
        //Recursive case
        //visit left
        postOrder(node.left);
        //visit right
        postOrder(node.right);
        //visit node
        System.out.print(node.info);

    }
    */

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(TreeNode node) {
        //base case
        if (node == null) return;
        //Recursive case
        //Visit left
        inOrder(node.left);
        //Visit node
        System.out.print(node.info);
        //visit right
        inOrder(node.right);
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(TreeNode node) {
        //base case
        if (node == null) return;
        //recursive case
        //visit node
        System.out.print(node.info);
        //visit left
        preOrder(node.left);
        //visit right
        preOrder(node.right);
    }

    public void postOrder() {
        NodeStack stack1 = new NodeStack();
        NodeStack stack2 = new NodeStack();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNode n = stack1.pop();
            stack2.push(n);

            if (n.left != null) stack1.push(n.left);
            if (n.right != null) stack1.push(n.right);
        }

        while (!stack2.isEmpty()) {
            TreeNode n = stack2.pop();
            System.out.print(n.info);

        }
    }
}
