package com.MultiThread;

public class DownloadingFileTask implements Runnable{


    private DownloadStatus status;

    public DownloadingFileTask(DownloadStatus status) {

        this.status = status;
    }

//    public DownloadingFileTask(){
//        this.status = new DownloadStatus();
//    }

    @Override
    public void run() {
//        System.out.println("Downloading a File: " + Thread.currentThread().getName());
//        for(var i = 0; i<Integer.MAX_VALUE; i++) {
//            if(Thread.currentThread().isInterrupted()) return;
//            System.out.println("Downloading Byte" + i);
//        }

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        System.out.println("Downdloading complete: " + Thread.currentThread().getName());

        //2 race condition

        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        for(var i = 0; i < 1_000_000; i++){
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }
//        status.done();
//        synchronized (status) {
//            status.notifyAll();
//        }

        System.out.println("Download Complete " + Thread.currentThread().getName());

        //confinement

//        System.out.println("Downloading a File: " + Thread.currentThread().getName());
//        for(var i = 0; i < 10_000; i++){
//            if(Thread.currentThread().isInterrupted()) return;
//            status.incrementTotalBytes();
//        }
//
//        System.out.println("Download Complete " + Thread.currentThread().getName());
    }

//    public DownloadStatus getStatus(){
//        return status;
//    }
}
