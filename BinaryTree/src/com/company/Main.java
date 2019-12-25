package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        TreeNode i = new TreeNode('I');
        TreeNode j = new TreeNode('J');
        TreeNode g = new TreeNode('G');

        g.left = i;
        g.right = j;

        TreeNode f = new TreeNode('f');
        TreeNode e = new TreeNode('e');
        e.left = f;
        e.right = g;

        TreeNode d = new TreeNode('d');
        TreeNode b = new TreeNode('b');
        b.left = d;
        b.right = e;

        TreeNode h = new TreeNode('H');
        TreeNode k = new TreeNode('K');
        TreeNode c = new TreeNode('C');

        c.left = h;
        c.right = k;
        TreeNode a = new TreeNode('A');
        a.left = b;
        a.right =c;

        BinaryTree btree= new BinaryTree(a);
        System.out.print("Pre-order traversal: ");
        btree.preOrder();
        System.out.println();
        System.out.print("In-order traversal: ");
        btree.inOrder();
        System.out.println();
        System.out.print("Post-order traversal: ");
        btree.postOrder();
    }
}
