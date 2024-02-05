import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import com.engeto.ja.Guest;
import com.engeto.ja.Reservation;
import com.engeto.ja.Room;
import com.engeto.ja.BookingManager;

public class Main {
    public static void main(String[] args) {
        BookingManager bookingList = new BookingManager();


        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));


        Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000.00));
        Room room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000.00));
        Room room3 = new Room(3, 3, false, true, BigDecimal.valueOf(2400.00));

        LocalDate arrival = LocalDate.of(2021, 7, 19);
        LocalDate checkout = LocalDate.of(2021, 7, 26);
        LocalDate arrival2 = LocalDate.of(2021, 9, 1);
        LocalDate checkout2 = LocalDate.of(2021, 9, 14);


        Reservation reservation = new Reservation(room1,arrival,checkout,true);
        Reservation reservation2 = new Reservation(room3,arrival2,checkout2,true);

        reservation.addGuest(guest1);
        reservation2.addGuest(guest1);
        reservation2.addGuest(guest2);
        bookingList.addReservation(reservation);
        bookingList.addReservation(reservation2);

        bookingList.getBookings();

    }
}