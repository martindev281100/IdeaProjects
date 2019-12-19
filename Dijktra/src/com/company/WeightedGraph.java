package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class WeightedGraph {
    int[][] matrix;                  // matrix represents weighted graph
    int[] distance;                  // current distance from root to all other vertices
    ArrayList<Integer> tobeChecked;  // vertices that are not checked
    ArrayList<Integer> checked;      // vertices that are checked (distance to root is min)
    int[] predecessor;               // previous vertex in the shortest path from root

    int nVertices;                   // number of vertices

    public WeightedGraph() throws FileNotFoundException {
        File input = new File("input.txt");
        Scanner sc = new Scanner(input);

        // read number of vertices
        nVertices = sc.nextInt();

        // read matrix
        matrix = new int[nVertices][nVertices];
        for (int i = 0; i < nVertices; i++) {
            for (int j = 0; j < nVertices; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // initiates other attributes
        distance = new int[nVertices];
        tobeChecked = new ArrayList<>();
        checked = new ArrayList<>();
        predecessor = new int[nVertices];
    }

    public void dijkstra() {
        // step 2
        distance[0] = 0;
        // step 3
        for (int i = 1; i < nVertices; i++) {
            distance[i] = Integer.MAX_VALUE; // infinity
        }
        // step 4 (put all vertices into tobeChecked
        for (int i = 0; i < nVertices; i++) {
            tobeChecked.add(i);
        }
        // step 5 (not necessary cause checked is initiated empty
        // step 6 -> 14
        while (!tobeChecked.isEmpty()) {
            int u = findVertexWithMinDistance();     // step 7, 8
            checked.add(u);                     // step 8
            for (int v : tobeChecked) {
                if (matrix[u][v] != 0) {        // v is adjacent to u
                    if (distance[v] > distance[u] + matrix[u][v]) {
                        distance[v] = distance[u] + matrix[u][v];
                        predecessor[v] = u;
                    }
                }
            }
        }
    }

    private int findVertexWithMinDistance() {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < tobeChecked.size(); i++) {
            int u = tobeChecked.get(i);
            if (distance[u] < min) {
                min = distance[u];
                minIndex = i;
            }
        }
        return tobeChecked.remove(minIndex);
    }
    // print shortest path from root to u
    public void printShortestPath(int u) {
        while (u != 0) {
            System.out.print(u + " <- ");
            u = predecessor[u];
        }
        System.out.println(u);
    }
}
