import java.util.ArrayList;
import java.util.List;

public class OperatingSystem {
    private List<Vehicle> vehicles;
    private List<Member> members;

    public OperatingSystem() {
        this.vehicles = new ArrayList<Vehicle>();
        this.members = new ArrayList<Member>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    public void registerMember(Member member){
        members.add(member);

    }
    public void rentVehicle(RentalAgreement rentalAgreement){
        if(!rentalAgreement.getVehicle().isAvailable()){
            System.out.println("vehicle rented: "+rentalAgreement.getVehicle().getType());
            rentalAgreement.getVehicle().setAvailable(false);
        }else{
            System.out.println("requested vehicle unavailable");
        }
    }

    public void returnVehicle(RentalAgreement rentalAgreement,long days){
        if(rentalAgreement.getDays()==days){
            System.out.println("bill: "+rentalAgreement.calculateBill());
        }else{
            rentalAgreement.calculateBill();
            rentalAgreement.applyLateFee(days-rentalAgreement.getDays());
            System.out.println("bill: "+rentalAgreement.getTotalCost());
        }

    }


}
