package com.pluralsight;

import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {

        //using scanner and prompting user input
        Scanner s = new Scanner(System.in);
        System.out.print("hi names please");
        String name = s.nextLine();
        String greeting = "hello " + name;

        System.out.print("on avarge how much tv you watch per week");
        //declaring variables and finding a total with expressions
        int numberOfDaysPerWeekWatchTV = s.nextInt();
        s.nextLine();

        System.out.print("on avarge how much tv you watch per min");
        int minutesPerDayOnAverage = s.nextInt();
        s.nextLine();

        int minutesPerWeek = numberOfDaysPerWeekWatchTV * minutesPerDayOnAverage;
        int minutesPerYear = minutesPerWeek * 52;
        int hoursPerYear = minutesPerYear/ 60;

        int hourInWorkWeek = 35;
        int workWeekPerYearWatchingTV = hoursPerYear / hourInWorkWeek;

        System.out.println("If " + name + " did not watch TV, it would be like a " + workWeekPerYearWatchingTV + " week vacation every year.");
        System.out.println(greeting);

    }
}
