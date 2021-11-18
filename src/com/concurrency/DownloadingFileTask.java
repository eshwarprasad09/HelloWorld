package com.concurrency;

public class DownloadingFileTask implements Runnable{
    private DownloadStatus status;

    public DownloadingFileTask(DownloadStatus status) {

        this.status = status;
    }
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        for(var i = 0; i < 10_000; i++){
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

        System.out.println("Download Complete " + Thread.currentThread().getName());
    }
}
