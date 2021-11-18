package com.tcs.day12;

public class BookingApp extends Thread implements Runnable{

    static BookSeats b;
    int seats = 2;
    public void run(){
        b.bookSeat(seats);
    }

    public static void main(String[] args){
        b = new BookSeats();
        for(var i = 0; i<10; i++) {
            BookingApp eshwar = new BookingApp();
            eshwar.seats = 2;
            eshwar.start();
//            BookingApp prasad = new BookingApp();
//            prasad.seats = 7;
//            prasad.start();
        }
    }
}
