import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;
    private List<Booking> bookings;
    private  String name;

    public Hotel(String name) {
        this.rooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.name = name;
    }
    public void addRoom(Room room){
        rooms.add(room);
    }
    public void bookRoom(Booking booking){
        if(!booking.getRoom().isAvailable()){
            booking.getRoom().book(booking.getRoom());
            bookings.add(booking);
            System.out.println("Booking successful");
            return;
        }
        System.out.println("No rooms are available");
    }
    public void cancelRoom(Booking booking){
       bookings.remove(booking);
       Alert alert=new Alert();
       alert.sendCancellationAlert(booking);
       System.out.println("Booking cancelled for "+ booking.getGuest().getName());
    }

}
