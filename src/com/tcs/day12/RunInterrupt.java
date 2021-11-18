package com.tcs.day12;

public class RunInterrupt extends Thread{

    static RunInterrupt2 ri;
    public void run(){
        ri.print();
    }

    public static void main(String[] args){
        ri = new RunInterrupt2();
        RunInterrupt runInterrupt = new RunInterrupt();
        runInterrupt.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        runInterrupt.interrupt();

    }

}
