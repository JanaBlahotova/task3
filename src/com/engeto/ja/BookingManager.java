package com.engeto.ja;

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
    List<Booking> privateVacations = new ArrayList<>();
    public void filterPrivateVacations(){
        privateVacations.clear();

        for (Booking booking : reservations){
            if (booking.isPrivateVacation()) {
                privateVacations.add(booking);
                // Kopírování dalších informací, pokud jsou k dispozici (například hosté, cena, apod.)
            }
        }
    }
    public void printRecreations () {
        int count=0;
        System.out.println("Rekreační rezervace: ");
        for (Booking booking  : privateVacations) {
            if (count >=8){
                break;
            }
            System.out.println(booking);
            count++;
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
