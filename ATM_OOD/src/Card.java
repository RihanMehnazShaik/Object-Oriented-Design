import java.time.LocalDate;
import java.util.Objects;

public class Card {
    private String cardNumber;
    private String expiryDate;
    private String pin;

    public Card(String cardNumber, String expiryDate, String pin) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    @Override
    public boolean equals(Object ob){
        if(this==ob) return true;
        if(ob==null || getClass()!=ob.getClass()) return false;
        Card card=(Card) ob;
        return Objects.equals(cardNumber,card.cardNumber);
    }
    @Override
    public int hashCode(){
        return Objects.hash(cardNumber);
    }
}
