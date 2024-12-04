import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String Id;
    private String source;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private List<Seat> seats;
    private  List<Passenger> passengers;

    public Flight(String Id, String source, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime,int noOfSeats) {
        this.Id = Id;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seats =new ArrayList<Seat>();
        this.passengers = new ArrayList<Passenger>();
        for(int i=1;i<=noOfSeats;i++){
            seats.add(new Seat(i));
        }
    }

    public String getId() {
        return Id;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookSeat(Passenger passenger){
        for(Seat seat:seats){
            if(!seat.isBooked()){
                seat.book(passenger);
                passengers.add(passenger);
                System.out.println("Seat booked for "+passenger.getName());
                return ;
            }
        }
        System.out.println("No seats available");
        return;
    }

    public void cancelBooking(Passenger passenger){

        for(Seat seat :seats){
            if(seat.getPassenger()!=null && seat.getPassenger().equals(passenger)){
                seat.cancel();
                passengers.remove(passenger);
                System.out.println("Cancellation of booking for "+passenger.getName()+" successful");
                return;
            }
        }
        System.out.println("No such booking was made.");
    }

}
