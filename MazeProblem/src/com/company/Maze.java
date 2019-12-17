package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze {
    private Cell[][] data;
    private CellStack stack;
    private Cell start;
    private Cell finish;

    public Maze() {
        this.data = null;
        this.stack = new CellStack();
    }

    public void init() throws FileNotFoundException {
        //read maze from a file
        File mazeFile = new File("input.txt");
        Scanner sc = new Scanner(mazeFile);
        int n = sc.nextInt();
        data = new Cell[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int d = sc.nextInt();
                Cell c = new Cell(i, j, d);
                data[i][j] = c;
                if (d == 2) start = c;
                if (d == 3) finish = c;
            }
            //init a test maze
        }
    }

    public void solve() {
        //1.Push start to: Stack
        //while not finish and not empty stack
        //2. Current move = pop from stack
        //3. Get next move from the current move
        //3.2 if moveable:
        //  push current move to stack
        //  4 if it is finish => break
        stack.push(start);
        boolean finish = false;
        while (!finish && !stack.IsEmpty()) {
            Cell current = stack.pop();
            Cell next = nextMove(current);
            if (next.value == 3) finish = true;
            while (next != null) {
                stack.push(current);
                current = next;
                current.value = -1;
                next = nextMove(current);
                if (next.value == 3) finish = true;
            }
        }
        if (finish) {
            System.out.println("Maze is solved");
        } else {
            System.out.println("Maze cannot be solved");
        }
    }

    private Cell nextMove(Cell current) {
        int n = data[0].length;
        //check up
        if (current.x > 0) {
            Cell next = data[current.x - 1][current.y];
            if (next.value == 0 || next.value == 3) return next;
        }
        //check right
        if (current.y < n - 1) {
            Cell next = data[current.x][current.y + 1];
            if (next.value == 0 || next.value == 3) return next;
        }
        //check down
        if (current.x < n - 1) {
            Cell next = data[current.x + 1][current.y];
            if (next.value == 0 || next.value == 3) return next;
        }
        //check left
        if (current.y > 0) {
            Cell next = data[current.x][current.y - 1];
            if (next.value == 0 || next.value == 3) return next;
        }
        return null;
    }

    private void printPath() {
        while (stack.IsEmpty()) {
            Cell c = stack.pop();
            c.value = 2;
        }
    }

    private void printMaze() {
        int n = data[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(data[i][j].value + "");
            }
            System.out.println("");
        }
    }
}
