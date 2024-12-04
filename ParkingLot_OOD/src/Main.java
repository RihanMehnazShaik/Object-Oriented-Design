import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot=ParkingLot.getInstance();
        ParkingFloor floor1=new ParkingFloor("F1");
        ParkingFloor floor2=new ParkingFloor("F2");
        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);
        floor1.addSlot(new ParkingSlot("f1s1",VehicleType.BIKE));
        floor2.addSlot(new ParkingSlot("f2s1",VehicleType.CAR));
        floor2.addSlot(new ParkingSlot("f2s2",VehicleType.TRUCK));
        Vehicle car=new Car("KA-103");
        Optional<ParkingSlot> slot=parkingLot.parkVehicle(car);
        if(slot.isPresent()){
            System.out.println("car parked in slot "+slot.get().getType());
        }else{
            System.out.println("no parking available");
        }

        Vehicle bike=new Bike("AP-002");
        Optional<ParkingSlot> slot2=parkingLot.parkVehicle(bike);
        if(slot2.isPresent()){
            System.out.println("bike parked in slot "+slot2.get().getType());
        }else{
            System.out.println("no parking available");
        }

        Vehicle truck=new Truck("RJ-29");
        Optional<ParkingSlot> slot3=parkingLot.parkVehicle(truck);
        if(slot3.isPresent()){
            System.out.println("truck parked in slot "+slot3.get().getType());
        }else{
            System.out.println("no parking available");
        }

        Ticket ticket1=new Ticket("T1",car);
        ticket1.setExitTime(LocalDateTime.now().plus(1, ChronoUnit.HOURS));
        PaymentService paymentService=new PaymentService(new CarFeeStrategy());
        double fee=paymentService.processPayment(ticket1.getParkingDuration());
        System.out.println("Parking fee= $"+fee);
        slot.get().unpark();

        Ticket ticket2=new Ticket("T2",bike);
        ticket2.setExitTime(LocalDateTime.now().plus(1, ChronoUnit.HOURS));
        PaymentService paymentService2=new PaymentService(new BikeFeeStrategy());
        double fee2=paymentService2.processPayment(ticket1.getParkingDuration());
        System.out.println("Parking fee= $"+fee2);
        slot2.get().unpark();

        Ticket ticket3=new Ticket("T3",truck);
        ticket3.setExitTime(LocalDateTime.now().plus(1, ChronoUnit.HOURS));
        PaymentService paymentService3=new PaymentService(new TruckFeeStrategy());
        double fee3=paymentService3.processPayment(ticket1.getParkingDuration());
        System.out.println("Parking fee= $"+fee3);
        slot3.get().unpark();
    }
}