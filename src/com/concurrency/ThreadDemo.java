package com.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo extends Thread {
    public void run() {
        System.out.println("My Thread is running");
    }

    public static void main(String[] args) {
        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();

        for (var i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadingFileTask(status));
            thread.start();
            threads.add(thread);
            System.out.println(thread.isAlive());
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(status.getTotalBytes());
        }
    }
}
