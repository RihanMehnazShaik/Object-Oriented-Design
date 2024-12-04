public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hotel hotel=new Hotel("Nayasa Lodge");
        Guest guest1=new Guest("tanaz","tn@gmail.com","9876543213","C001");
        Guest guest2=new Guest("mehnaz","mn@gmail.com","9876543213","C002");
        Room r1=new Room(6,RoomType.SUITE);
        Room r2=new Room(2,RoomType.STANDARD);
        hotel.addRoom(r1);
        hotel.addRoom(r2);
        Booking b1=new Booking(r1,guest1,"2024-07-19","2024-07-22");
        Booking b2=new Booking(r2,guest2,"2024-07-20","2024-07-25");
        hotel.bookRoom(b1);
        hotel.bookRoom(b2);
        Alert alert=new Alert();
        alert.scheduleCheckInTimer(b1,2);
        hotel.cancelRoom(b2);



    }
}