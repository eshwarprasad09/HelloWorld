package com.company;

public class Browser {
    public void navigate(String address){
        String ip = findIpAddress(address);
        String http = findHttp(ip);
        System.out.println(http);
    }

    private String findHttp(String ip) {
        return "<html>/<html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}
