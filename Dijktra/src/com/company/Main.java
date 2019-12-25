package com.company;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        try {
            WeightedGraph graph = new WeightedGraph();
            graph.dijkstra();
            for (int u = 1; u < 6; u++) {
                graph.printShortestPath(u);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File input.txt not found");
        }
    }
            }
