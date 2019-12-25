package com.company;

import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(11);
        bst.insert(2);
        bst.insert(104);
        bst.insert(243);
        bst.insert(32);
        bst.insert(43);
        bst.insert(54);

        if (bst.search(10)) {
            System.out.println("Found 10");
        } else {
            System.out.println(" Not Found 10");
        }
        if (!bst.search(32)) {
            System.out.println("Not found 32");
        }
        try {
            bst.insert(32);
        } catch (BSTDuplicateNodeException ex) {
            System.out.println("Duplicate 32!");
        }
    }
}
