package com.pluralsight;

public class Demo1 {

    public static void main(String[] args) {

        //print a message
        System.out.println("Hello Luis! \n");

        //declaring variables with values
        char status = 'm';
        int number = 1;
        String name = "Tashi";

        //write and assign an expression
        String greeting = "Hello " + name;
        //print greeting
        System.out.println(greeting);

        //declaring variables and finding a total with expressions
        int numberOfDaysPerWeekWatchTV = 6;
        int minutesPerDayOnAverage = 100;

        int minutesPerWeek = numberOfDaysPerWeekWatchTV * minutesPerDayOnAverage;
        int minutesPerYear = minutesPerWeek * 52;
        int hoursPerYear = minutesPerYear/ 60;

        int hourInWorkWeek = 35;
        int workWeekPerYearWatchingTV = hoursPerYear / hourInWorkWeek;

        System.out.println("If " + name + " did not watch TV, it would be like a " + workWeekPerYearWatchingTV + " week vacation every year.");
        System.out.println(greeting);

    }
}
