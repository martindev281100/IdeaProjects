package com.fgw.gch0712.MessageSystem;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Stack {
    private String [] array;
    private int top;
    private int max;

    public Stack(int max){
        this.max = max;
        array = new String[max];
        top = -1;
    }

    public boolean isEmpty(){
        if (top == -1) return true;
        else return false;
    }

    public boolean isFull(){
        if (top == max -1) return true;
        else return false;
    }

    public void push(String message){
        if (isFull()){
            throw new OutOfMemoryError("The stack is full");
        }else {
            array[++top] = message;
        }
    }

    public String pop(){
        if (isEmpty()){
            throw new StackEmptyException("The stack is empty");
        }else {
            String x = array[top--];
            return x;
        }
    }
}
