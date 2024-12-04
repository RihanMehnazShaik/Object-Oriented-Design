import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingFloor {
    private String id;
    private List<ParkingSlot> slots;

    public ParkingFloor(String id) {
        this.id = id;
        this.slots = new ArrayList<>();
    }
    public void addSlot(ParkingSlot slot){
        slots.add(slot);
    }
    public Optional<ParkingSlot> findAvailableSlot(VehicleType type){
        return slots.stream().filter(slot->slot.getType()== type && slot.isAvailable()).findFirst();
    }
}
