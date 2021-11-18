package com.tcs.day12;

public class SleepInterupt2 {

    public void print(){
        System.out.println("In the printing method first line");
        try {
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            System.out.println("Sleep Interuppted");
        }
        System.out.println("In the printing method second line");
    }

}
