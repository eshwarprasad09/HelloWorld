package com.MultiThread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {

    // 2 race condition and //3 confinement //4 lock
//    private AtomicInteger totalBytes = new AtomicInteger();
//    private int totalBytes;
    private LongAdder totalBytes = new LongAdder();
    private volatile boolean isDone;
    private Lock lock = new ReentrantLock();

//    public int getTotalBytes(){
//        return totalBytes.get();
//    }
public int getTotalBytes(){
    return totalBytes.intValue();
}

    public void incrementTotalBytes(){
//        lock.lock();
//        try {
//            totalBytes++;
//        }
//        finally {
//            lock.unlock();
//        }
//        totalBytes.incrementAndGet();
        totalBytes.increment();
    }

    public void done(){
        isDone = true;
    }

    public boolean isDone(){
        return isDone;
    }
}
