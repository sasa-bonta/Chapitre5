package com.company;

import java.util.Scanner;

public class Asteriks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bar1;
        int bar2;
        int bar3;
        int bar4;
        int bar5;

        System.out.print("Enter quantity of asteriks for 1st bar : ");
        bar1 = input.nextInt();

        System.out.print("Enter quantity of asteriks for 2nd bar : ");
        bar2 = input.nextInt();

        System.out.print("Enter quantity of asteriks for 3rd bar : ");
        bar3 = input.nextInt();

        System.out.print("Enter quantity of asteriks for 4th bar : ");
        bar4 = input.nextInt();

        System.out.print("Enter quantity of asteriks for 5th bar : ");
        bar5 = input.nextInt();

        printAsteriks(bar1);
        printAsteriks(bar2);
        printAsteriks(bar3);
        printAsteriks(bar4);
        printAsteriks(bar5);
    }

    public static void printAsteriks(int counter) {
        int i;
        for (i = 0; i < counter; i++) {
            System.out.print("* ");
        }
        System.out.println("");
    }
}
