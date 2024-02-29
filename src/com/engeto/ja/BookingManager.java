package com.engeto.ja;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class BookingManager {

    private List<Booking> reservations;

    public BookingManager() {
        this.reservations = new ArrayList<>();
    }

    public List<Booking> getReservations() {
        return reservations;
    }

    public void setReservations(List<Booking> reservations) {
        this.reservations = reservations;
    }

    public void addBooking(Booking reservation) {
        reservations.add(reservation);
    }



    public Booking getBooking(int index) {
        // Ověření, zda je index v rozsahu seznamu
        if (index >= 0 && index < reservations.size()) {
            return reservations.get(index);
        } else {
            throw new IndexOutOfBoundsException(); // Index mimo rozsah, není možné získat rezervaci
        }
    }

    public void printAllBookings() {
        for (Booking reservation : reservations) {
            System.out.println(reservation);
        }
    }

    public void printRecreations(BookingManager bookingManager) {
        int count=0;
        System.out.println("Rekreační rezervace: ");
        for (Booking reservation : bookingManager.getReservations()) {
            if (count >=8){
                break;
            }
            if (reservation.isPrivateVacation()) {
                System.out.println(this.reservations);

                count++;
            }

        }
    }
    public double getAverageStayDuration() {
        if (reservations.isEmpty()) {
            return 0.0;
        }

        int totalDuration = 0;
        for (Booking reservation : reservations) {
            totalDuration += reservation.getStayDuration();
        }

        return (double) totalDuration / reservations.size();
    }
}
