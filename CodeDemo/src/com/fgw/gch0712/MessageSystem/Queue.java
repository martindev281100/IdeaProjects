package com.fgw.gch0712.MessageSystem;

public class Queue {
    private String [] array;
    private int max, top;

    public Queue(int max){
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
        return false;
    }

    public void enqueue(String messages){
        if (isFull()){
            System.out.println("the queue is full");
            return;
        }else {
            array[++top] = messages;
        }
    }

    public String dequeue(){
        if (isEmpty()){
            throw new QueueEmptyException("Queue is empty");
        }else {
            String x = array[0];
            for (int i = 0; i < top; i++){
                array[i]=array[i+1];
            }
            top--;
            return x;
        }
    }
}
