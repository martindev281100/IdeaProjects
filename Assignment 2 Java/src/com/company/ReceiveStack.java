package com.company;

class ReceiveStack {
    public String message;
    private int max;
    private int top;
    private final String[] stack;

    public ReceiveStack(int max) {
        this.max = max;
        stack = new String[max];
        top = -1;
    }

    public String pop() {
        if (isEmpty()) {
            throw new StackEmptyException("Empty stack!");
        } else {
            String a = stack[top--];
            return a;
        }
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

    //Viet ham kiem tra xem stack co chua mot message khong, neu co thi tra ve true, ko thi tra ve false
    public boolean search(String a) {
        String b = stack[];
        if (a.contains(b)) {
            return true;
        } else {
            return false;
        }
    }
}


