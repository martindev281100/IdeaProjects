package com.company;

class ReceiveStack {
    private int max ;
    private int top;
    private final String[] stack;

    public ReceiveStack(int max) {
        this.max = max;
        stack = new String[max];
        top = -1;
    }

    public void clear() {
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(String a) {
        if (top == max - 1) {
            System.out.println("Full stack !");
            return;
        }
        stack[++top] = a;
    }

}
