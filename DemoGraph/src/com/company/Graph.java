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
        for (int i =0; i < nRows; i++)
        {
            vertices[i] = new Vertex();
            vertices[i].label = i +1;
            vertices[i].color = Vertex.WHITE;
        }
    }
    public void BFS()
    {
        Vertex root = vertices[0];
        root.color = Vertex.GREY;

        VertexQueue q = new VertexQueue();
        q.enqueue(root);

        while (!q.isEmpty())
        {
            Vertex u = q.dequeue();
        }
    }
}
