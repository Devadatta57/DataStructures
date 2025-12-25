package com.queue;

class QueuesAddDelete {
    int size;
    int[] a;
    int rear = -1;
    int front = -1;

    QueuesAddDelete(int size) {
        this.size = size;
        a = new int[size];
    }

    public void add(int data) {
        if (rear == size) {
            System.out.println("Queue full");
            return;
        }

        if (front == -1) {   // ✅ correct empty check
            front = rear = 0;
        }

        a[rear++] = data;
    }

    public void delete() {
        if (front == -1) {   // ✅ correct empty check
            System.out.println("Queue empty");
            return;
        }

        System.out.println("Deleted: " + a[front]);
        front++;

        if (front == rear) { // queue becomes empty
            front = rear = -1;
        }
    }

    public void display() {
        if (front == -1) {
            System.out.println("empty queue");
            return;
        }

        for (int i = front; i < rear; i++) {//    front--12345---rear//after last insetion rear++ means rear reaches size so i<rear means i= front means from 0 to 4 not 5
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

public class NormalQueues {
    public static void main(String[] args) {
        QueuesAddDelete q = new QueuesAddDelete(5);

        q.add(34);
        q.add(56);
        q.add(67);
        q.add(68);
        q.add(90);
        q.add(578); // Queue full

        q.display();
    }
}
