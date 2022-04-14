package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner keyboard = new Scanner(System.in);
        int number = -1; int blocks = number;

        while (number < 1 || number > 8)
        {
            System.out.println("Choose number between 1-8");
            number = keyboard.nextInt();
        }
        for (int i = 1; i <= number; i++) {
            int m;
            for (m = (number - i) + 1; m >= 0; m--) {
                System.out.print(" ");
            }
            for (m = 1; m <= i; m++)
            {
                System.out.print("#");

            } System.out.println();
        }
        System.out.println("  ");

        for (int i = 1; i <= number; i++) {
            for (int m = 1; m<= i; m++)
            {
                System.out.print("#");
            }

            System.out.println();
        }


    }

}




