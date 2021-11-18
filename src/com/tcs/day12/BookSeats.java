package com.tcs.day12;

public class BookSeats {

    int totalSeats = 10;

    public void bookSeat(int seats){
        synchronized (this) {
            if (totalSeats >= seats) {
                System.out.println("Seats booked succesfully");
                totalSeats = totalSeats - seats;
                System.out.println("Seats left: " + totalSeats);
            } else {
                System.out.println("Seats cannot be booked ");
                System.out.println("Seats left: " + totalSeats);
            }
        }
    }
}