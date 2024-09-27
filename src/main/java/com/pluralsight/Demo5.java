package com.pluralsight;

import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) {

        float subtotal = 22.87f;
        float tax = subtotal * 0.0825f;
        float totalDue = subtotal + tax;

        System.out.println("Total due is " + totalDue);
        System.out.println("Total due is: " + String.format("%.2f", totalDue));
        System.out.println(String.format("Total due is % .2f ", totalDue));
        System.out.printf("Total due is %.2f ", totalDue);

        System.out.println();
        //prompt user to enter something and display the message
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = myScanner.nextLine();
        System.out.println("hello " + name );
    }

}
