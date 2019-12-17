package com.company;

import java.util.ArrayList;

public class VertexQueue extends ArrayList<Vertex> {
    public void enqueue(Vertex v) {
        this.add(0, v);
    }

    public Vertex dequeue() {
        int n = this.size() - 1;
        return this.remove(n);
    }
}
