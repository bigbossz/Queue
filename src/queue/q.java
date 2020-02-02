/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Scanner;

/**
 *
 * @author Brandon
 */
public class q {

    Scanner sc = new Scanner(System.in);
    int head = -1;//rear
    int tail = -1;//front
    int size = sc.nextInt();
    int[] arr = new int[size];

    void enqueue() {
        if (head == size - 1) {
            System.out.println("Queue is full!!");
        } else {
            if (tail == -1 && head == -1) {
            tail = 0;
            head = 0;
        } else {

            head = head + 1;

        }

            System.out.println("Enter Value:");
            int v = sc.nextInt();
            arr[head] = v;
            System.out.println("Item inserted!!");
        }
        
    }

    void dequeue() {
        int v;
        if (tail == -1) {
            System.out.println("Queue is Empty!!");
        } else {
            v = arr[tail];
            if (tail == head) {
                tail = -1;
                head = -1;
            } else {
                tail = tail + 1;
            }
            System.out.println("Value deleted!");
        }
    }

    void display() {
        if (head == -1) {
            System.out.println("No element!!");
        } else {
            System.out.println("Queue element/s:");
            for (int i = tail; i <= head; i++) {
                System.out.println("**" + arr[i]);
            }
        }
    }
}
