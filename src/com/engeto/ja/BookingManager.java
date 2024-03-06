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


    public void addBooking(Booking reservation) {
        reservations.add(reservation);
    }

    public Booking getBooking(int index) {

        if (index >= 0 && index < reservations.size()) {
            return reservations.get(index);
        }
        else throw new IndexOutOfBoundsException();
    }


    public void getBookings() {
        for (Booking reservation : reservations) {
            System.out.println(reservation);
        }
    }
    public void getNumberOfWorkingBookings() {
        int count=0;
        System.out.println("Pracovní pobyty: ");
        for (var booking  : reservations) {
            if (booking.isPrivateVacation()) {
                continue;
            }

            System.out.println(booking);
            count++;
        }
    }
    public void getFirstEightPrivateBookings() {
        int count=0;
        System.out.println("Prvních 8 rekreačních pobytů: ");
        for (var booking  : reservations) {
            if (!booking.isPrivateVacation()) {
                continue;
            }
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

    public void clearAllBookings() {
        reservations.clear();
        System.out.println("Seznam rezervací smazán");
    }

}
