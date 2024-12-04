import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Airline airline=new Airline("Air Asia");
        Flight flight1=new Flight("AA01","Banglore","Hyderabad", LocalDateTime.of(2024,7,19,12,0),LocalDateTime.of(2024,7,12,13,0),140);
        Flight flight2=new Flight("AA02","Delhi","Chandigarh", LocalDateTime.of(2024,7,19,12,0),LocalDateTime.of(2024,7,12,13,0),100);

        airline.addFlight(flight1);
        airline.addFlight(flight2);

        Passenger passenger1=new Passenger("tanaz","74166187167","ps01");
        Passenger passenger2=new Passenger("mehnaz","9145672383","ps02");

        flight1.bookSeat(passenger1);
        flight2.bookSeat(passenger2);

        flight1.cancelBooking(passenger1);
        flight2.cancelBooking(passenger1);

    }
}