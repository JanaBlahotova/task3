package com.engeto.ja;
import java.util.List;
import java.util.ArrayList;
public class ListOfBooking {

    private List<Reservation> reservations;

    public ListOfBooking() {
        this.reservations = new ArrayList<>();
    }
    public void addReservation(Reservation reservation){
        reservations.add(reservation);
    }
    public void printAllReservations(){
        for (Reservation reservation : reservations){
            System.out.println("Room: " + reservation.getRoom().getRoomNo());
            System.out.println("Arrival: " + reservation.getArrival());
            System.out.println("Checkout: " + reservation.getCheckout());
            System.out.println("Private journey: " + reservation.isPrivateVacation());
            System.out.println("Guests:");
            for (Guest guest : reservation.getGuests()) {
                System.out.println("  " + guest.getFirstName() + " " + guest.getSurname());
            }
            System.out.println("**********************");
        }
    }


}
