package com.engeto.ja;

import java.time.LocalDate;
import java.util.ArrayList;


public class Reservation {
    private Room room;
    private LocalDate arrival;
    private LocalDate checkout;
    private boolean isPrivateVacation;
    private ArrayList<Guest> guests;
    int guestsPerReservation = 0;
    public Reservation(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest){
        guests.add(guest);
    }
    public Reservation(Room room, LocalDate arrival, LocalDate checkout, boolean isPrivateVacation){
        this.room = room;
        this.arrival = arrival;
        this.checkout = checkout;
        this.isPrivateVacation = isPrivateVacation;
        this.guests = new ArrayList<>();
    }

    public String getIsPrivateVacationAsString(){
        return isPrivateVacation ? "soukromá cesta" : "pracovní cesta";
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getArrival() {
        return arrival;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setArrival(LocalDate arrival) {
        this.arrival = arrival;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }



    public int getGuestsPerReservation() {
        return guestsPerReservation;
    }

    public void setGuestsPerReservation(int guestsPerReservation) {
        guestsPerReservation = guestsPerReservation;
    }

    public boolean isPrivateVacation() {
        return isPrivateVacation;
    }

    public void setPrivateVacation(boolean privateVacation) {
        isPrivateVacation = privateVacation;
    }

}

