package com.tcs.day12;

public class SleepInterupt extends Thread{
    static SleepInterupt2 si;
    public void run(){
        si.print();
    }

    public static void main(String[] args){
        si = new SleepInterupt2();
        SleepInterupt sleepInterupt = new SleepInterupt();
        sleepInterupt.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sleepInterupt.interrupt();

    }

}
