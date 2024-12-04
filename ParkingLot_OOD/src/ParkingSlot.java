public class ParkingSlot {
    private String id;
    private VehicleType type;
    private boolean isOccupied;

    public ParkingSlot(String id, VehicleType type) {
        this.id = id;
        this.type = type;
        this.isOccupied = false;
    }

    public String getId() {
        return id;
    }

    public VehicleType getType() {
        return type;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isAvailable(){
        return !isOccupied;
    }
    public void park(){
        isOccupied=true;
    }
    public void unpark(){
        isOccupied=false;
    }
}
