import java.util.Optional;

public class BookingSystem {
    public Optional<Ticket> bookTicket(ShowTime showTime, Seat seat, PricingStrategy pricingStrategy){
        if(!showTime.isFull()){
           if(showTime.isAvailable(seat)){
               seat.bookSeat();
               Optional<Ticket> ticket= Optional.of(new Ticket(showTime, "T" + System.currentTimeMillis(), seat, pricingStrategy
               ));
               System.out.println("Ticket booked successfully");
               seat.isBooked();
               if(ticket.isPresent()){
                   return ticket;
               }
               }
            {
                System.out.println("Seat is unavailable");
                return Optional.empty();
            }

        }
        System.out.println("House Full, cannot book the tickets");
        return Optional.empty();
    }
    public void cancelTicket(Ticket ticket){
        ticket.getSeat().cancelSeat();
    }
}
