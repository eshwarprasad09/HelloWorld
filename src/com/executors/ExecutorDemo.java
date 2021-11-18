package com.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args){
        var executor = Executors.newFixedThreadPool(2);

        try{
            var future = executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                LongTask.simulate();
                return 1;
            });

            System.out.println("Do more work");
            try {
                var result = future.get();
                System.out.println(result);
                System.out.println("waiting");
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        finally {
            executor.shutdown();
        }
    }


}
