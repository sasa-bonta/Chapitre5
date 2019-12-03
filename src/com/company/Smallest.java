package com.company;

import java.util.Scanner;

public class Smallest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter;
        int number;
        int smallest;
        int i;

        System.out.print("Enter quantity of numbers : ");
        counter = input.nextInt();

        System.out.print("Enter the number[1] : ");
        number = input.nextInt();
        smallest = number;

        for (i = 1; i < counter; i++) {
            System.out.printf("Enter the number[%d] : ", i+1);
            number = input.nextInt();

            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.printf("The smallest number is : %d", smallest);
    }
}
