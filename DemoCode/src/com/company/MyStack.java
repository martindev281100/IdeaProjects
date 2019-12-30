package com.company;

/**
 *
 * @author Admin
 */
class MyStacks {
    private final String [] arr;
    private int top;
    private final int max;

    public MyStacks (int max) {
        this.max = max;
        arr = new String[max];
        top = -1;
    }
    public void clear(){
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(String x){
        if(top == max -1){
            System.out.println("The stack is full, cannot push");
            return;
        }
        arr[++top] =x;
    }
    public String pop() throws Exception{
        if (isEmpty())
            throw new Exception("Cannot pop from an empty stack");
        String x = arr[top];
        top--;
        return x;
    }
}

