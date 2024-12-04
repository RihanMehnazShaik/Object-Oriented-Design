public class Ticket {
    private ShowTime showTime;
    private String ticketId;
    private Seat seat;
    private PricingStrategy pricingStrategy;

    public Ticket(ShowTime showTime, String ticketId, Seat seat, PricingStrategy pricingStrategy) {
        this.showTime = showTime;
        this.ticketId = ticketId;
        this.seat = seat;
        this.pricingStrategy = pricingStrategy;
    }

    public ShowTime getShowTime() {
        return showTime;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Seat getSeat() {
        return seat;
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public double calculatePrice(){
        return pricingStrategy.calculatePrice(showTime);
    }
}
