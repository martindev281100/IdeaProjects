package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        PatientQueue queue = new PatientQueue();
        Patient p = new Patient("John", 20);
        queue.enqueue(p);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
        try {
            queue.dequeue();
        } catch (QueueEmptyException qe) {
            System.out.println(qe.getMessage());
        }
        try {
            for (int i = 0; i < 50; i++) {
                queue.enqueue(p);
            }
        } catch (QueueOverflowException qe) {
            System.out.println(qe.getMessage());
        }
    }
}
