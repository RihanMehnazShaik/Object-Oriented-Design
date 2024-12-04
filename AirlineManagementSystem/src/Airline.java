import java.util.ArrayList;
import java.util.List;

public class Airline {
    private List<Flight> flights;
    private String name;

    public Airline(String name) {
        this.name = name;
        this.flights=new ArrayList<Flight>();
    }

    public String getName() {
        return name;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public Flight getFlightById(Flight Id){
        return flights.stream().filter(flight->flight.getId().equals(Id)).findFirst().orElse(null);
    }
    public void addFlight(Flight flight){
        flights.add(flight);
    }
    public void removeFlight(String Id){
        flights.removeIf(flight->flight.getId().equals(Id));
    }
}
