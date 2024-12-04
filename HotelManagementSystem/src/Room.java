enum RoomType{
    STANDARD,DELUXE,SUITE;
}


public class Room {
    private int number;
    private boolean isAvailable;
    private double price;
    private RoomType roomType;

    public Room(int number,RoomType roomType){
        this.number = number;
        this.isAvailable = false;
        this.roomType=roomType;
        if(roomType==RoomType.DELUXE){
            this.price = 3000;
        }else if(roomType==RoomType.STANDARD){
            this.price = 700;
        }else{
            this.price = 5000;
        }
    }

    public boolean isAvailable(){
        return isAvailable;
    }
    public void book(Room room){
        room.isAvailable=false;

    }

    public int getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
