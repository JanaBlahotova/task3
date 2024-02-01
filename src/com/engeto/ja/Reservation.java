package com.engeto.ja;

import java.time.LocalDate;

public class Reservation {
    private Room room;
    private LocalDate arrival;
    private LocalDate checkout;
    private boolean isPrivateVacation;
    private Guest [] guests;

    public Reservation(Room room, LocalDate arrival, LocalDate checkout, boolean isPrivateVacation, Guest [] guests){
        this.room = room;
        this.arrival = arrival;
        this.checkout = checkout;
        this.isPrivateVacation = isPrivateVacation;
        this.guests = guests;
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

    public void setGuests(Guest[] guests) {
        this.guests = guests;
    }

    public Guest[] getGuests() {
        return guests;
    }

    public boolean isPrivateVacation() {
        return isPrivateVacation;
    }

    public void setPrivateVacation(boolean privateVacation) {
        isPrivateVacation = privateVacation;
    }
}

