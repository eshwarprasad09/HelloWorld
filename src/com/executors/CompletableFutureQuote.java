package com.executors;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureQuote {
    public static void main(String[] args){
        var start = LocalTime.now();
        var service = new FlightService();
        var futures = service.getQuotes().map(future -> future.thenAccept(System.out::println))
                .collect(Collectors.toList());
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(() -> {
                    var end = LocalTime.now();
                    var duration = Duration.between(start,end);
                    System.out.println("Retrived all quotes " + duration.toMillis() + "msec.");
                });
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
