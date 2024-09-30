package com.pluralsight;

public class Demo7 {

    //example of three methods
    public static void main(String[] args) {

        System.out.println("Welcome!");
        //call a method named foo
        game();
        //call a method named moo
        anime();
        //all a method named song
        song();

    }

    //a method used to call game
    public static void game(){
        System.out.println("Fortnite");

    }
    //a method used to call anime
    public static void anime() {
        System.out.println("One Piece");
    }

    //a method used to call a song
    public static void song(){
        System.out.println("No Face - Drake");
    }
}
