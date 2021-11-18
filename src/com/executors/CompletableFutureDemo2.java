package com.executors;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo2 {

    public static CompletableFuture<String> getEmailAsync(){
        return CompletableFuture.supplyAsync(() -> "email");
    }

    public static CompletableFuture<String> getPlayListAsync(String email){
        return CompletableFuture.supplyAsync(() -> "playlist");
    }

    public static void main(String[] args){

        getEmailAsync()
                .thenCompose(CompletableFutureDemo2::getPlayListAsync).thenAccept(playlist -> System.out.println(playlist));

    }
}
