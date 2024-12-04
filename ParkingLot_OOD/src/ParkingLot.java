import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingLot {
    private List<ParkingFloor> floors;
    private static ParkingLot instance;

    private ParkingLot(){
        this.floors=new ArrayList<>();
    }
    public static synchronized ParkingLot getInstance(){
        if(instance==null){
            return new ParkingLot();
        }else{
            return instance;
        }
    }
    public void addFloor(ParkingFloor floor){
        floors.add(floor);
    }
    public Optional<ParkingSlot> parkVehicle(Vehicle vehicle){
        for(ParkingFloor floor:floors){
            Optional<ParkingSlot> slot=floor.findAvailableSlot(vehicle.getType());
            if(slot.isPresent()){
                slot.get().park();
                return slot;
            }
        }
        return Optional.empty();
    }
}
