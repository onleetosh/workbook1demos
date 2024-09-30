package com.pluralsight;

public class Demo8 {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        //calling addAndDisplay method
        addAndDisplay(a, b);
        addAndDisplay(b, c);
        addAndDisplay(a, d);
        addAndDisplay(d, b);

        //parameters passing through an arguement
        addAndDisplay(20, 10);
        addAndDisplay(60, 30);

    }

    //declaring a static method with two parameters
    public static void addAndDisplay(int num1, int num2){
        int sum = num1 + num2;
        //Java string format specifier '%d' to return integer
        System.out.printf("%d + %d = %d \n", num1, num2, sum);
        System.out.println();

        //formatting 3 characters
        System.out.printf("%3d + %3d = %3d \n", num1, num2, sum);

        //formatting
        System.out.printf("%d + %d = %d \n", num1, num2, sum);



    }
}
