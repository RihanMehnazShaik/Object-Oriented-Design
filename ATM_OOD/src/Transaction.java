abstract class Operations {
    private String transactionId;
    abstract void withdraw(double amount,Account account,ATM atm);
    abstract void deposit(double amount,Account account,ATM atm);
    abstract void checkBalance(Account account);
}

class Transaction extends Operations{
    public void withdraw(double amount,Account account,ATM atm) {
        if (account.withDraw(amount) && atm.checkCashAvailability(amount)) {
            account.setBalance(account.getBalance() - amount);
            atm.dispenseCash(atm.getCashInventory() - amount);
            System.out.println("Date: " + new java.util.Date());
            System.out.println("Withdrawal successful.");
        }
    }
        public void deposit(double amount,Account account,ATM atm){
            if(account.deposit(amount)){
                account.setBalance(account.getBalance()+amount);
                atm.refillCash(amount);
                System.out.println("Date: "+ new java.util.Date());
                System.out.println("Deposit successful");
            }
        }
        public void checkBalance(Account account){
            System.out.println("Current Balance :"+account.getBalance());
        }
}


