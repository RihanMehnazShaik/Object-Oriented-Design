public class Seat {
    private int seatNumber;
    private boolean isBooked;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public void bookSeat(){
        isBooked=true;
    }
    public void cancelSeat(){
        isBooked=false;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
