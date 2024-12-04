public interface PricingStrategy {
    double calculatePrice(ShowTime showTime);
}
class SilverSeat implements PricingStrategy{
    public double calculatePrice(ShowTime showTime){
        return 100.0;
    }

}

class GoldSeat implements PricingStrategy{
    public double calculatePrice(ShowTime showTime){
        return 200.0;
    }
}

class PlatinumSeat implements PricingStrategy{
    public double calculatePrice(ShowTime showTime){
        return 350.0;
    }
}


