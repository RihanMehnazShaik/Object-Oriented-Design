public class Seat {
    private int seatnumber;
    private boolean isBooked=false;
    private Passenger passenger;

    public Seat(int seatnumber) {
        this.seatnumber = seatnumber;
    }

    public boolean isBooked(){
        return this.isBooked;
    }
    public void book(Passenger passenger){
        this.isBooked=true;
        this.passenger=passenger;
    }
    public void cancel(){
        this.isBooked=false;
        this.passenger=null;
    }

    public int getSeatnumber() {
        return seatnumber;
    }

    public Passenger getPassenger() {
        return passenger;
    }
}
