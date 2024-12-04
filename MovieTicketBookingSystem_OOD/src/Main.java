import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Movie movie1=new Movie("Gladiator II","history",120);
        Movie movie2=new Movie("Romancham","horror/comedy",130);
        Movie movie3=new Movie("LuckyBhaskar","crimeDrama",155);


        ShowTime showTime1=new ShowTime(LocalDateTime.of(2024,7,15,9,0),movie1, 3);

        ShowTime showTime2=new ShowTime(LocalDateTime.of(2024,7,15,2,0),movie1, 2);

        ShowTime showTime3=new ShowTime(LocalDateTime.of(2024,7,15,9,0),movie2, 1);

        ShowTime showTime4=new ShowTime(LocalDateTime.of(2024,7,15,9,0),movie3, 3);

        Cinema cinema1=new Cinema("INOX");
        cinema1.addShowTime(Arrays.asList(showTime1,showTime2));
        Cinema cinema2=new Cinema("INOX");
        cinema2.addShowTime(Arrays.asList(showTime3,showTime4));

        BookingSystem bookingSystem=new BookingSystem();
        PricingStrategy pricingStrategy=new GoldSeat();
        Optional<Ticket> ticket=bookingSystem.bookTicket(showTime1,s1,pricingStrategy);
        if(ticket.isPresent()){
            System.out.println("Ticket Price: "+pricingStrategy.calculatePrice(showTime1));
        }

        pricingStrategy=new GoldSeat();
        ticket=bookingSystem.bookTicket(showTime1,s2,pricingStrategy);
        if(ticket.isPresent()){
            System.out.println("Ticket Price: "+pricingStrategy.calculatePrice(showTime1));
        }
        pricingStrategy=new GoldSeat();
        ticket=bookingSystem.bookTicket(showTime1,showTime1.s3,pricingStrategy);
        if(ticket.isPresent()){
            System.out.println("Ticket Price: "+pricingStrategy.calculatePrice(showTime1));
        }
        pricingStrategy=new GoldSeat();
        ticket=bookingSystem.bookTicket(showTime2,s1,pricingStrategy);
        if(ticket.isPresent()){
            System.out.println("Ticket Price: "+pricingStrategy.calculatePrice(showTime1));
        }
        pricingStrategy=new GoldSeat();
        ticket=bookingSystem.bookTicket(showTime2,s2,pricingStrategy);
        if(ticket.isPresent()){
            System.out.println("Ticket Price: "+pricingStrategy.calculatePrice(showTime2));
        }

    }
}