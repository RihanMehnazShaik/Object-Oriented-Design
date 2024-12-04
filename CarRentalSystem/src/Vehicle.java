import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String id;
    private String type;
    private String location;
    private boolean isAvailable;
    private List<VehicleLog> vehicleLogs;

    public Vehicle(String id, String type, String location) {
        this.id = id;
        this.type = type;
        this.location = location;
        this.isAvailable=false;
        this.vehicleLogs=new ArrayList<VehicleLog>();
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void addVehicleLogs(Vehicle vehicle,String msg){
        vehicleLogs.add(new VehicleLog(vehicle.getId(),vehicle.getLocation(),msg));
    }

    public List<VehicleLog> getVehicleLogs() {
        return vehicleLogs;
    }
}
