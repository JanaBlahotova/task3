package com.engeto.ja;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Booking {
    private Room room;
    private LocalDate arrival;
    private LocalDate checkout;
    private boolean isPrivateVacation;
    private ArrayList<Guest> guests;
    int guestsPerReservation = 0;
    BigDecimal TotalCost;

    public BigDecimal getTotalCost() {
        return room.getPricePerNight().multiply(new BigDecimal(getStayDuration()));
    }

    public int getStayDuration() {
        if (arrival != null && checkout != null) {
            return (int) ChronoUnit.DAYS.between(arrival, checkout);
        } else {
            return 0;
        }
    }

    public Booking(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public Booking(Room room, LocalDate arrival, LocalDate checkout, boolean isPrivateVacation) {
        this.room = room;
        this.arrival = arrival;
        this.checkout = checkout;
        this.isPrivateVacation = isPrivateVacation;
        this.guests = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "room=" + room +
                ", arrival=" + arrival +
                ", checkout=" + checkout +
                ", isPrivateVacation=" + isPrivateVacation +
                ", guests=" + guests +
                '}';
    }

    public String getBookingLength() {
        if (arrival != null && checkout != null) {
            long length = ChronoUnit.DAYS.between(arrival, checkout);
            return String.valueOf(length) + " days";
        } else {
            return "0 days";
        }
    }

        public String getIsPrivateVacationAsString () {
            return isPrivateVacation ? "soukromá cesta" : "pracovní cesta";
        }

        public Room getRoom () {
            return room;
        }

        public LocalDate getArrival () {
            return arrival;
        }

        public LocalDate getCheckout () {
            return checkout;
        }

        public void setRoom (Room room){
            this.room = room;
        }

        public void setArrival (LocalDate arrival){
            this.arrival = arrival;
        }

        public void setCheckout (LocalDate checkout){
            this.checkout = checkout;
        }

        public int getGuestsPerReservation () {
            return guestsPerReservation;
        }

        public void setGuestsPerReservation ( int guestsPerReservation){
            this.guestsPerReservation = guestsPerReservation;
        }

        public boolean isPrivateVacation () {
            return isPrivateVacation;
        }

        public void setPrivateVacation ( boolean privateVacation){
            this.isPrivateVacation = privateVacation;
        }
    }
