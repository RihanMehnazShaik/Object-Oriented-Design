import java.time.LocalDateTime;
public class Ticket {
    private String id;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(String id, Vehicle vehicle) {
        this.id = id;
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now();
    }

    public long getParkingDuration(){
        return java.time.Duration.between(entryTime,exitTime).toMinutes();
    }

    public LocalDateTime setExitTime(LocalDateTime t) {
        return exitTime=t;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
