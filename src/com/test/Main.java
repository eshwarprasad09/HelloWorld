package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private int id;
    private String name;
    private int exp;
    private int matchesPlayed;
    private int runsScored;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getExp() {
        return exp;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }



    public Main(int id, String name, int exp, int matchesPlayed, int runsScored){
        this.id = id;
        this.name = name;
        this.exp = exp;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }

    public static void main(String[] args){
        int id;
        String name;
        int exp;
        int matchesPlayed;
        int runsScored;

        Scanner scanner = new Scanner(System.in);

        List<Main> avg = new ArrayList<>();

        for (var i = 0; i < 4; i++){
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
            Main avgerage = new Main(id,name,exp,matchesPlayed,runsScored);
            avg.add(avgerage);
        }

        for(Main avgr : avg){
            int average = avgr.getRunsScored() / avgr.matchesPlayed;

            if(average >= 80 && average <= 100){
                System.out.println("Grade A");
            }
            else if(average >= 50 && average <= 79){
                System.out.println("Grade B");
            }
            else{
                System.out.println("Grade C");
            }

        }
    }
}
