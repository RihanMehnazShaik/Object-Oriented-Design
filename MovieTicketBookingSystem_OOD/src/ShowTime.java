import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ShowTime {
    private LocalDateTime time;
    private Movie movie;
    private List<Seat> seats;

    public ShowTime(LocalDateTime time, Movie movie, int size) {
        this.time = time;
        this.movie = movie;
        this.seats = new ArrayList<>();
        for(int i=0;i<size;i++){
            this.seats.add(new Seat(i));
        }
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Movie getMovie() {
        return movie;
    }

    public int noOfSeats(){
        return seats.size();
    }

    public boolean isFull(){
        for(Seat seat:seats){
            if(!seat.isBooked()){
                return false;
            }
        }
        return true;
    }

    public boolean isAvailable(Seat seat){
        if(!seat.isBooked()) return true;
        else return false;
    }
}
