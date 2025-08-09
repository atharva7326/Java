package com.threading.practice;

// Shared resource
class TicketBooking {
    private int availableSeats;

    public TicketBooking(int seats) {
        this.availableSeats = seats;
    }

    // Synchronized method ensures only one thread can book at a time
    public synchronized void bookTicket(String name) {
        System.out.println("--------------------------------------------------");
        if (availableSeats > 0) {
            System.out.println(name + " is trying to book a ticket...");
            try {
                Thread.sleep(1000); // Simulate booking time
            } catch (InterruptedException e) {
                System.out.println("Booking interrupted for " + name);
            }

            System.out.println(name + " successfully booked the ticket!");
            availableSeats--;
        } else {
            System.out.println("Sorry " + name + ", seat already booked!");
        }
        System.out.println("Remaining Seats: " + availableSeats);
        System.out.println("--------------------------------------------------");
    }
}

// User thread
class User extends Thread {
    private TicketBooking booking;
    private String userName;

    public User(TicketBooking booking, String userName) {
        this.booking = booking;
        this.userName = userName;
    }

    @Override
    public void run() {
        booking.bookTicket(userName);
    }
}

// Main class
public class TicketBookingSystem {
    public static void main(String[] args) throws InterruptedException {
        TicketBooking booking = new TicketBooking(1); // Only 1 seat available

        // Creating multiple users trying to book the same seat
        User user1 = new User(booking, "Renu");
        User user2 = new User(booking, "Sai");
        User user3 = new User(booking, "Mahasa");

        // Starting threads
        user1.start();
        user1.join(); //it help to complete one thread completely then other statement get start
        user2.start();
        user2.join();
        user3.start();
        user3.join();
    }
}
