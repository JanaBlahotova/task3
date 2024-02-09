package com.engeto.ja;
import java.util.Arrays;
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

    public List<Reservation> getReservations() {
        return reservations;
    }

       public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void getBookings(){
        reservations.forEach(reservation -> {
            System.out.println("Room: " + reservation.getRoom().getRoomNo());
            System.out.println("Arrival: " + reservation.getArrival());
            System.out.println("Checkout: " + reservation.getCheckout());
            System.out.println("Type of journey: " + reservation.getIsPrivateVacationAsString());
            System.out.println("Guests:");

            reservation.getGuests().forEach(guest -> System.out.println("  " + guest.getFirstName() + " " + guest.getSurname()));

            System.out.println("**********************");
        });}

        public void clearBookings(){
        reservations.clear();
        }
        public double getAverageGuests() {
        if (reservations.isEmpty()) {
            return 0.0;
        }

        int totalGuests = 0;

        for (Reservation reservation : reservations) {
            totalGuests += reservation.getGuests().size();
        }

        return (double) totalGuests / reservations.size();
        }
        public int getNumberOfWorkingBookings() {
            int count = 0;
            for (Reservation reservation : reservations) {
                if (!!reservation.isPrivateVacation()) {
                    count++;
                }
            }
            return count;
        }

        public Reservation getBooking (int index){
                    if (index>=0 && index < reservations.size()){
                        return reservations.get(index);
                    }
                    else {return null;}

    }






}
