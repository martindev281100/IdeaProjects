package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    Stack<String> stack = new Stack<String>();
	    stack.push("test");
        stack.push("tes");
        stack.push("tet");
        stack.push("tst");
        stack.push("est");

        System.out.println("test: " + stack.contains("test"));
        //day, search la ra vi tri cua element trong stack
    }
}