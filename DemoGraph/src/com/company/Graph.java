package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Graph {
    private int[][] matrix;
    private int nRows;
    private Vertex[] vertices;

    public Graph() throws FileNotFoundException {
        // read from file
        File f = new File("input.txt");
        Scanner sc = new Scanner(f);

        nRows = sc.nextInt();
        matrix = new int[nRows][nRows];

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nRows; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        vertices = new Vertex[nRows];
        for (int i = 0; i < nRows; i++) {
            vertices[i] = new Vertex();
            vertices[i].label = i + 1;
            vertices[i].color = Vertex.WHITE;
        }
    }

    public void BFS() {
        reset();
        Vertex root = vertices[0];
        root.color = Vertex.GREY;

        VertexQueue q = new VertexQueue();
        q.enqueue(root);

        while (!q.isEmpty()) {
            Vertex u = q.dequeue();
            int row = u.label - 1;
            for (int col = 0; col < nRows; col++) {
                if (matrix[row][col] == 1) {
                    Vertex v = vertices[col];
                    if (v.color == Vertex.WHITE) {
                        v.color = Vertex.GREY;
                        q.enqueue(v);
                    }
                }
            }
            u.color = Vertex.BLACK;
            System.out.println("Visit " + u.label);
        }
    }

    private void reset() {
        for (int i = 0; i < nRows; i++) {
            vertices[i].color = Vertex.WHITE;
        }
    }

    public void DFS() {
        reset();// paint all vertices into WHITE
        Vertex root = vertices[0];
        DFS(root);
    }

    private void DFS(Vertex u) {
        u.color = Vertex.GREY;
        int row = u.label - 1;
        for (int col = 0; col < nRows; col++) {
            if (matrix[row][col] == 1) {
                Vertex v = vertices[col];
                if (v.color == Vertex.WHITE) {
                    DFS(v);
                }
            }
        }
        u.color = Vertex.BLACK;
        System.out.println("Visit " + u.label);
    }
}
