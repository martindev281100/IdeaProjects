package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MessagesStack {
    private String[] stack;
    private int pos;
    private int max;

    public MessagesStack(int size) {
        max = size;
        stack = new String[size];
        pos = -1;
    }

    public boolean isFull() {
        return pos == max - 1;
    }

    public boolean isEmpty() {
        return pos == -1;
    }

    public void push(String mess) {
        if (isFull()) {
            System.out.println("Stack full");
            return;
        } else {
            stack[++pos] = mess;
        }
    }

    public int size() {
        return pos + 1;
    }

    public String pop() {
        if (isEmpty()) {
            throw new StackEmptyException("Empty Stack!");
        } else {
            return stack[pos--];
        }
    }

    public boolean check(String mess) {
        List<String> list = Arrays.asList(stack);
        if (list.contains(mess)) return true;
        return false;
    }

}
