package com.testtt;

import java.util.Scanner;

public class Main {
//    public void average(int matchesplayed, int runsScored){

//        int avg = runsScored / matchesplayed;
//
//        if(avg >= 80 && avg <= 100){
//            System.out.println("Grade A");
//        }
//        else if(avg >= 50 && avg <= 79){
//            System.out.println("Grade A");
//        }
//        else{
//            System.out.println("Grade C");
//        }

//    }

    public static void main(String[] args){

        int id;
        String name;
        int exp;
        int matchesPlayed;
        int runsScored;

        Main main = new Main();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Id");
        id = scanner.nextInt();
        System.out.println("Enter Name");
        name = scanner.next();
        System.out.println("Enter exp");
        exp = scanner.nextInt();
        System.out.println("Enter matches played");
        matchesPlayed = scanner.nextInt();
        System.out.println("Enter runs scored");
        runsScored = scanner.nextInt();

        int avg = runsScored / matchesPlayed;

        if(avg >= 80 && avg <= 100){
            System.out.println("Grade A");
        }
        else if(avg >= 50 && avg <= 79){
            System.out.println("Grade A");
        }
        else{
            System.out.println("Grade C");
        }
//            main.average(matchesPlayed,runsScored);

    }
}
