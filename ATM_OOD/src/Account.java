public class Account {
    private String accountId;
    private double balance;

    public Account(String accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withDraw(double amount){
        return (balance>=amount)?true:false;
    }
    public boolean deposit(double amount){
        if(balance+amount<=200000) return true;
        else return false;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
