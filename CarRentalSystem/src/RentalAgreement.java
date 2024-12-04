
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RentalAgreement {
    private Vehicle vehicle;
    private Member member;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalCost;
    private List<AdditionalService> addOns;
    private long days;
    public RentalAgreement(Vehicle vehicle, Member member, LocalDate startDate, LocalDate endDate) {
        this.vehicle = vehicle;
        this.member = member;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalCost = 0;
        this.addOns = new ArrayList<AdditionalService>();
        this.days=java.time.temporal.ChronoUnit.DAYS.between(startDate,endDate);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public double getTotalCost() {
        return totalCost;
    }
    public long getDays(){
        return days;
    }

    public List<AdditionalService> getAddOns() {
        return addOns;
    }

    public double calculateBill(){
       return (totalCost+=days*50);
    }
    public double applyLateFee(long lateDays){
        return totalCost+=lateDays*20;
    }
    public double  addSpecialService(AdditionalService additionalService){
        addOns.add(additionalService);
        return totalCost+=additionalService.getCost();
    }

}
