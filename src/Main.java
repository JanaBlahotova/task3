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
        Guest guest3 = new Guest("Vlastimil", "Hort", LocalDate.of(1944,1,12));
        Guest guest4 = new Guest("Viktor","Korchnoi",LocalDate.of(1931,3,23));
        Guest guest5 = new Guest("David","Navara",LocalDate.of(1985,3,27));

        ArrayList<Guest> guestsList = new ArrayList<>();
        guestsList.add(guest1);
        guestsList.add(guest2);
        guestsList.add(guest3);
        guestsList.add(guest4);
        guestsList.add(guest5);
        Reservation reservations = new Reservation(guestsList);

        System.out.println(guestsList);

        Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000.00));
        Room room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000.00));
        Room room3 = new Room(3, 3, false, true, BigDecimal.valueOf(2400.00));

        LocalDate arrival = LocalDate.of(2021, 7, 19);
        LocalDate checkout = LocalDate.of(2021, 7, 26);
        LocalDate arrival2 = LocalDate.of(2021, 9, 1);
        LocalDate checkout2 = LocalDate.of(2021, 9, 14);
        LocalDate arrival3 = LocalDate.of(2022,1,3);
        LocalDate checkout3 = LocalDate.of(2022,4,3);


        Reservation reservation = new Reservation(room1, arrival, checkout, true);
        Reservation reservation2 = new Reservation(room3, arrival2, checkout2, true);
        Reservation reservation3 = new Reservation(room3,arrival3,checkout3,false);

        reservation.addGuest(guest1);
        reservation2.addGuest(guest1);
        reservation2.addGuest(guest2);
        reservation3.addGuest(guest3);
        reservation3.addGuest(guest4);
        reservation3.addGuest(guest5);

        bookingList.addReservation(reservation);
        bookingList.addReservation(reservation2);
        bookingList.addReservation(reservation3);

        bookingList.getBookings();

        reservation.getGuests().forEach(guest -> System.out.println("Jméno a příjmení: " + guest.getFirstName() + " " + guest.getSurname()));

        reservation2.getGuests().forEach(guest -> System.out.println("Jméno a příjmení: "+guest.getFirstName() + " " + guest.getSurname()));

        int indexToRetrieve = 2; // Replace with the desired index
        Reservation retrievedReservation = bookingList.getBooking(indexToRetrieve);

        if (retrievedReservation != null) {
            System.out.println("Požadovaná rezervace: " + retrievedReservation);
        } else {
            System.out.println("Invalid index or reservation not found.");
        }


        double averageGuests;
        averageGuests = bookingList.getAverageGuests();
        System.out.println(reservation);

        System.out.println("Průměrný počet hostů: " + averageGuests);
        int numberOfWorkingBookings = bookingList.getNumberOfWorkingBookings();
        System.out.println("Počet pracovních cest: " + numberOfWorkingBookings);
        }
}


