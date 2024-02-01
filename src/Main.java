import java.time.LocalDate;
import java.math.BigDecimal;
import com.engeto.ja.Guest;
import com.engeto.ja.Reservation;
import com.engeto.ja.Room;
import com.engeto.ja.ListOfBooking;

public class Main {
    public static void main(String[] args) {
        ListOfBooking bookingList = new ListOfBooking();

        Guest guest1 = new Guest ("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest ("Jan","Dvořáček",LocalDate.of(1995,5,5));

        Room room1 = new Room (1,1, true,true,1000);
        Room room2 = new Room(2,1,true,true,1000);
        Room room3 = new Room(3,3, false, true,2400);

        LocalDate arrival = LocalDate.of(2021,7,19);
        LocalDate checkout = LocalDate.of(2021,7,26);
        LocalDate arrival2 = LocalDate.of (2021,9,1);
        LocalDate checkout2 = LocalDate.of(2021,9,14);

        Guest[] guestsArray = {guest1};
        Reservation reservation = new Reservation(room1,arrival, checkout, true, guestsArray);
        Guest[] guestsArray2 = {guest1,guest2};
        Reservation reservation2 = new Reservation(room3,arrival2,checkout2,true, guestsArray2);

        bookingList.addReservation(reservation);
        bookingList.addReservation(reservation2);
        bookingList.printAllReservations();
    }
}