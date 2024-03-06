import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import com.engeto.ja.Guest;
import com.engeto.ja.Booking;
import com.engeto.ja.Room;
import com.engeto.ja.BookingManager;


public class Main {

    public static void printGuestStatistics(BookingManager bookingManager) {
        int singleGuestReservations = 0;
        int doubleGuestReservations = 0;
        int moreThanTwoGuestsReservations = 0;


        for (Booking booking : bookingManager.getReservations()) {
            int numberOfGuests = booking.getGuests().size();

            if (numberOfGuests == 1) {
                singleGuestReservations++;
            } else if (numberOfGuests == 2) {
                doubleGuestReservations++;
            } else {
                moreThanTwoGuestsReservations++;
            }

            int stayDuration = booking.getStayDuration();
            BigDecimal totalCost = booking.getTotalCost();

            System.out.printf("\nRezervace: %s až %s\nPočet hostů: %d\nCelková cena: %s%nPočet dní celkem: %d%n\n",


                    booking.getArrival(), booking.getCheckout(), numberOfGuests, totalCost, stayDuration);
        }

        System.out.println("Celkový počet rezervací s jedním hostem: " + singleGuestReservations);
        System.out.println("Celkový počet rezervací se dvěma hosty: " + doubleGuestReservations);
        System.out.println("Celkový počet rezervací s více než dvěma hosty: " + moreThanTwoGuestsReservations);
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d. MMMM. yyyy");
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);

        BookingManager bookingList = new BookingManager();

        ArrayList<Guest> guestsList = new ArrayList<>(Arrays.asList(
                new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13)),
                new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5)),
                new Guest("Vlastimil", "Hort", LocalDate.of(1944, 1, 12)),
                new Guest("Viktor", "Korchnoi", LocalDate.of(1931, 3, 23)),
                new Guest("David", "Navara", LocalDate.of(1985, 3, 27)),
                new Guest("Karolína", "Tmavá", LocalDate.of(1988, 3, 6)),
                new Guest("Karel", "Dvořák", LocalDate.of(1990, 5, 15)),
                new Guest("Karel", "Dvořák", LocalDate.of(1979, 1, 3))
        ));

        Booking reservations = new Booking(guestsList);
        System.out.println(guestsList);


        Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000.00));
        Room room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000.00));
        Room room3 = new Room(3, 3, false, true, BigDecimal.valueOf(2400.00));

        LocalDate arrival = LocalDate.of(2021, 7, 19);
        LocalDate checkout = LocalDate.of(2021, 7, 26);
        LocalDate arrival2 = LocalDate.of(2021, 9, 1);
        LocalDate checkout2 = LocalDate.of(2021, 9, 14);
        LocalDate arrival3 = LocalDate.of(2022, 1, 3);
        LocalDate checkout3 = LocalDate.of(2022, 2, 3);
        LocalDate arrival4 = LocalDate.of(2023, 6, 1);
        LocalDate checkout4 = LocalDate.of(2023, 6, 7);
        LocalDate arrival5 = LocalDate.of(2023, 7, 18);
        LocalDate checkout5 = LocalDate.of(2023, 7, 21);
        LocalDate arrival6 = LocalDate.of(2023, 8, 1);
        LocalDate checkout6 = LocalDate.of(2023, 8, 2);
        LocalDate arrival7 = LocalDate.of(2023, 8, 3);
        LocalDate checkout7 = LocalDate.of(2023, 8, 4);
        LocalDate arrival8 = LocalDate.of(2023, 8, 5);
        LocalDate checkout8 = LocalDate.of(2023, 8, 6);
        LocalDate arrival9 = LocalDate.of(2023, 8, 7);
        LocalDate checkout9 = LocalDate.of(2023, 8, 8);
        LocalDate arrival10 = LocalDate.of(2023, 8, 9);
        LocalDate checkout10 = LocalDate.of(2023, 8, 10);



        Booking reservation = new Booking(room1, arrival, checkout, true);
        Booking reservation2 = new Booking(room3, arrival2, checkout2, true);
        Booking reservation3 = new Booking(room3, arrival3, checkout3, false);
        Booking reservation4 = new Booking(room3, arrival4, checkout4, false);
        Booking reservation5 = new Booking(room2, arrival5, checkout5, true);
        Booking reservation6 = new Booking(room2, arrival6, checkout6, false);
        Booking reservation7 = new Booking(room2, arrival7, checkout7, false);
        Booking reservation8 = new Booking(room2, arrival8, checkout8, false);
        Booking reservation9 = new Booking(room2, arrival9, checkout9, false);
        Booking reservation10 = new Booking(room2, arrival10, checkout10, false);

        reservation.addGuest(new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13)));
        reservation2.addGuest(new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5)));
        reservation2.addGuest(new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5)));
        reservation3.addGuest(new Guest("Vlastimil", "Hort", LocalDate.of(1944, 1, 12)));
        reservation3.addGuest(new Guest("Viktor", "Korchnoi", LocalDate.of(1931, 3, 23)));
        reservation3.addGuest(new Guest("David", "Navara", LocalDate.of(1985, 3, 27)));
        reservation4.addGuest(new Guest("Viktor", "Korchnoi", LocalDate.of(1931, 3, 23)));
        reservation5.addGuest(new Guest("David", "Navara", LocalDate.of(1985, 3, 27)));
        reservation6.addGuest(new Guest("Karolína", "Tmavá", LocalDate.of(1988, 3, 6)));
        reservation7.addGuest(new Guest("Karolína", "Tmavá", LocalDate.of(1988, 3, 6)));
        reservation8.addGuest(new Guest("Karolína", "Tmavá", LocalDate.of(1988, 3, 6)));
        reservation9.addGuest(new Guest("Karolína", "Tmavá", LocalDate.of(1988, 3, 6)));
        reservation10.addGuest(new Guest("Karolína", "Tmavá", LocalDate.of(1988, 3, 6)));


        BookingManager bookingManager = new BookingManager();



        bookingManager.addBooking(reservation);
        bookingManager.addBooking(reservation2);
        bookingManager.addBooking(reservation3);
        bookingManager.addBooking(reservation4);
        bookingManager.addBooking(reservation5);
        bookingManager.addBooking(reservation6);
        bookingManager.addBooking(reservation7);
        bookingManager.addBooking(reservation8);
        bookingManager.addBooking(reservation9);
        bookingManager.addBooking(reservation10);

        bookingManager.getBookings();

        double averageStayDuration = bookingManager.getAverageStayDuration();
        System.out.println("Průměrná délka pobytu: " + averageStayDuration + " dní");

        try {
            Booking reservationAtIndex2 = bookingManager.getBooking(2);
            System.out.println("Rezervace na indexu:" + reservationAtIndex2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index mimo rozsah seznamu rezervací.");
        }
        for (Booking reservationList : bookingManager.getReservations()) {
            System.out.println(reservationList.toString());
        }

            Booking bookings = bookingManager.getBooking(0);
            Booking bookings2 = bookingManager.getBooking(2);


            printGuestStatistics(bookingManager);

            bookingManager.getNumberOfWorkingBookings();
            bookingManager.getFirstEightPrivateBookings();

            bookingManager.clearAllBookings();
            bookingManager.getNumberOfWorkingBookings();

        }
    }


