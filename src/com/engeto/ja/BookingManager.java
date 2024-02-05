package com.engeto.ja;
import java.util.List;
import java.util.ArrayList;
public class BookingManager {

    private List<Reservation> reservations;

    public BookingManager() {
        this.reservations = new ArrayList<>();
    }
    public void addReservation(Reservation reservation){
        reservations.add(reservation);
    }
    public void getBookings(){
        for (Reservation reservation : reservations){
            System.out.println("Room: " + reservation.getRoom().getRoomNo());
            System.out.println("Arrival: " + reservation.getArrival());
            System.out.println("Checkout: " + reservation.getCheckout());
            System.out.println("Type of journey: " + reservation.getIsPrivateVacationAsString());
            System.out.println("Guests:");
            for (Guest guest : reservation.getGuests()) {
                System.out.println("  " + guest.getFirstName() + " " + guest.getSurname());
            }
            System.out.println("**********************");
        }
    }
    public void clearBookings(){

    }


}
