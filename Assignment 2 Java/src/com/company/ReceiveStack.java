package com.company;

class ReceiveStack {
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
            return stack[top--];
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

        String b = stack[top];
        do {
            if (a.contains(b))
             return true;
        } while (a.contains(b));
        return false;
    }
}


