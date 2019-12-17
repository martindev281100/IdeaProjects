package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        try {
            Graph g = new Graph();
            System.out.println("Breadth first search: ");
            g.BFS();
            System.out.println("Depth first search: ");
            g.DFS();
        } catch (FileNotFoundException ex) {
            System.out.println(" Not found !" + ex.getMessage());
        }
    }
}