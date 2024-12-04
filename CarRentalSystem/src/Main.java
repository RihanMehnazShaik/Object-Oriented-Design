import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       OperatingSystem operatingSystem=new OperatingSystem();
       Vehicle v1=new Vehicle("C001","Sudan","Garage A");
       Vehicle v2=new Vehicle("C002","Duster","Garage B");
       operatingSystem.addVehicle(v1);
       operatingSystem.addVehicle(v2);
       Member m1=new Member("mini","9876543219","M001");
       Member m2=new Member("tanu","1234567897","M002");
       operatingSystem.registerMember(m1);
       operatingSystem.registerMember(m2);
       RentalAgreement rentalAgreement=new RentalAgreement(v2,m1, LocalDate.of(2024,07,19),LocalDate.of(2024,07,25));
       v2.addVehicleLogs(v2,"Rented successfully");
       rentalAgreement.addSpecialService(new AdditionalService("GPS",10));
       rentalAgreement.addSpecialService(new AdditionalService("Insurance",50));
       operatingSystem.rentVehicle(rentalAgreement);
       operatingSystem.returnVehicle(rentalAgreement,8);
       v2.addVehicleLogs(v2,"Returned successfully");


    }
}