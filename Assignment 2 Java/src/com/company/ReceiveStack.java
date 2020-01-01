package com.company;
import java.util.*;

public class ReceiveStack {
    public static void test(){
        System.out.println("test search element: " + test.search("test"));
    }

    public String message;
    private int max;
    private int top;

    private final Stack<String> stack;

    public ReceiveStack() {
        this.max = max;
        stack = new Stack<String>();
        top = -1;
    }

    public String pop() {
        if (stack.size() == 0) {
            throw new StackEmptyException("Emptyu");
        } else {
            String a = stack.pop();
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

    Viet ham kiem tra xem stack co chua mot message khong, neu co thi tra ve true, ko thi tra ve false
    public boolean search(String a) {
        String b = stack[];
        if (a.contains(b)) {
            return true;
        } else {
            return false;
        }
    }
}


