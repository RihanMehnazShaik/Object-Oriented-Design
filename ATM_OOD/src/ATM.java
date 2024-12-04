public class ATM {
    private String location;
    private String atmId;
    private double cashInventory;// max capacity 200000/-

    public ATM(String location, String atmId, double cashInventory) {
        this.location = location;
        this.atmId = atmId;
        this.cashInventory = cashInventory;
    }
    public boolean authenticate(String pin,Card card){
        return card.getPin().equals(pin);
    }
    public void refillCash(double amount){
        cashInventory+=amount;
    }
    public void dispenseCash(double amount){
        if(cashInventory>=amount){
            cashInventory-=amount;
        }
    }
    public boolean checkCashAvailability(double amount){
        return (cashInventory>=amount);
    }

    public double getCashInventory() {
        return cashInventory;
    }
}
