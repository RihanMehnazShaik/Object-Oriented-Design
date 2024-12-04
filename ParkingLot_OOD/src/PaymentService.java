
interface ParkingFeeStrategy{
    double calculateFee(long duration);
}
class CarFeeStrategy implements ParkingFeeStrategy{
    public double calculateFee(long duration){
        return duration*0.2;
    }
}
class TruckFeeStrategy implements ParkingFeeStrategy{
    public double calculateFee(long duration){
        return duration*0.3;
    }
}
class BikeFeeStrategy implements ParkingFeeStrategy{
    public double calculateFee(long duration){
        return duration*0.1;
    }
}


public class PaymentService {
    private ParkingFeeStrategy feeStrategy;

    public PaymentService(ParkingFeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }
    public double processPayment(long duration){
        return feeStrategy.calculateFee(duration);
    }
}
