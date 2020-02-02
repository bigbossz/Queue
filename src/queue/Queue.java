/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Scanner;

/**
 *
 * @author wendz_md
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int c = 0;
        q que = new q();
        System.out.println("--------------------------------");
        while (c != 4) {
            System.out.println("Choose Action:");
            System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
            System.out.println("Enter your choice:");
            c = sc.nextInt();
            switch (c) {
                case 1: {
                    que.enqueue();
                    break;
                }
                case 2: {
                    que.dequeue();
                    break;
                }
                case 3: {
                    que.display();
                    break;
                }
                case 4: {
                    System.out.println("Boooooom!!!!!!");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Please Enter valid choice!!");
                }
            };
        }
    }
    
}
