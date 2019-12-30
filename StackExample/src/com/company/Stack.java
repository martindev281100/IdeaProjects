package com.company;

public interface Backpack {
    void push();

    void pop();

    boolean isFull(Object element);

    boolean isEmpty(Object element);

    void peek();


}
