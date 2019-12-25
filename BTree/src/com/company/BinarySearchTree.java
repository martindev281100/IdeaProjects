package com.company;

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        if (this.isEmpty()) {
            root = new TreeNode(value);
        } else {
            insert(value, root);//insert value from root
        }
    }

    private void insert(int value, TreeNode current) {
        if (value < current.value) {
            if (current.left == null) {
                current.left = new TreeNode(value);
            } else {
                insert(value, current.left);
            }
        } else if (value > current.value) {
            if (current.right == null) {
                current.right = new TreeNode(value);
            } else {
                insert(value, current.right);
            }
        } else {
            throw new BSTDuplicateNodeException();
        }
    }

    public boolean search(int value) {
        return search(value, root);
    }

    private boolean search(int value, TreeNode current) {
        //Base case
        if (current == null) return false;
        //compare value with current value
        if (value == current.value) return true;
        //go to left to search
        else if (value < current.value) return search(value, current.left);
        //go to right to search
        else return search(value, current.right);
    }

    public void sort() {
        inOrder(root);
    }

    private void inOrder(TreeNode current) {
        if (current == null) return; //base case
        //visit current
        System.out.println(current.value);
        //visit left
        inOrder(current.right);
    }
}
