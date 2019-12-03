package com.company.CalculatingSales;

import java.util.Scanner;

public class Calculating {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Product product1 = new Product(1, 2.98f);
        Product product2 = new Product(2, 4.50f);
        Product product3 = new Product(3, 9.98f);
        Product product4 = new Product(4, 4.49f);
        Product product5 = new Product(5, 6.87f);

        int productNumber;
        int quantity;
        float sales = 0.0f;

        System.out.println("Products : 1 = 2.98 ; 2= 4.50 ; 3 = 9.98 ; 4 = 4.49 ; 5 = 6.87 ");

        System.out.print("Enter Nr. of product and its quantity or -1 to quit : ");
        productNumber = input.nextInt();
        quantity = input.nextInt();

        while (productNumber != -1) {

            switch (productNumber) {
                case 1: {
                    sales += product1.getPrice() * quantity;
                    break;
                }

                case 2: {
                    sales += product2.getPrice() * quantity;
                    break;
                }

                case 3: {
                    sales += product3.getPrice() * quantity;
                    break;
                }

                case 4: {
                    sales += product4.getPrice() * quantity;
                    break;
                }

                case 5: {
                    sales += product5.getPrice() * quantity;
                    break;
                }
            }

            System.out.print("Enter Nr. of product and its quantity or -1 to quit : ");
            productNumber = input.nextInt();
            if (productNumber == -1)
                break;
            quantity = input.nextInt();
        }
        System.out.printf("Total sales are = %.2f", sales);
    }
}
