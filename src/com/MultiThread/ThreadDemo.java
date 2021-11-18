package com.MultiThread;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadDemo extends Thread{
    public void run(){
        System.out.println("My Thread is running");
    }

    public static void main(String[] args){
//        System.out.println(Thread.currentThread().getName());

//        for(var i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadingFileTask());
//            thread.start();

//            ThreadDemo td = new ThreadDemo();
//            td.start();

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        thread.interrupt();


//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("File is ready to be scanned");
//        }

        //2 race condition and 4 lock
//        var status = new DownloadStatus();
//
//        List<Thread> threads = new ArrayList<>();
//
//        for(var i = 0; i < 10; i++) {
//            var thread = new Thread(new DownloadingFileTask(status));
//            thread.start();
//            threads.add(thread);
//            System.out.println(thread.isAlive());
//        }

//        for(var thread : threads){
//            try {
//                System.out.println(thread.isAlive());
//                thread.join();
//                System.out.println(thread.isAlive());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(status.getTotalBytes());

        //confinement
//        List<Thread> threads = new ArrayList<>();
//        List<DownloadingFileTask> tasks = new ArrayList<>();
//        for(var i = 0; i<10; i++) {
//            var task = new DownloadingFileTask();
//            tasks.add(task);
//            var thread = new Thread(task);
//            thread.start();
//            threads.add(thread);
//        }
//
//        for(var thread : threads){
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//       var totalBytes = tasks.stream().map(t -> t.getStatus().getTotalBytes()).reduce(Integer::sum);
//        System.out.println(totalBytes);

        //volatile

//        var status = new DownloadStatus();
//
//        var thread1 = new Thread(new DownloadingFileTask(status));
//        var thread2 = new Thread(() -> {
//            while (!status.isDone()){
//                synchronized (status) {
//                    try {
//                        status.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//            System.out.println(status.getTotalBytes());
//        });
//        thread1.start();
//        thread2.start();

        //synchronized collection
        Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<>());

        var thread1 = new Thread(() -> {
            collection.addAll(Arrays.asList(1,2,3));
        });

        var thread2 = new Thread(() -> {
            collection.addAll(Arrays.asList(4,5,6));
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(collection);

        //concurrent collections
        Map<Integer,String> map = new ConcurrentHashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
        map.get(1);
        map.remove(1);

    }

}
