package com.tcs.day12;

public class RunInterrupt2 {

    public void print() {
        for (var i = 0; i < 100_000; i++) {
            if(Thread.interrupted()){
                System.out.println("Thread Interrupted");
                return;
            }
            System.out.println("In the printing method first line");
        }
    }

}
