import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm=new ATM("Old Delhi","12SSDg3",200000);
        Card card=new Card("1234-5678-1234-5678","11/30","1945");
        Account account=new Account("ACC001",5000);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your pin:");
        String pin=sc.nextLine();

        if(atm.authenticate(pin,card)){
            System.out.println("Authentication successfull");
        }else{
            System.out.println("Authentication failed");
            return;
        }
        System.out.println("Select transaction type:\n1.withdrawal\n2.deposit\n3.check balance");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter withdrawal amount:");
                double amount=sc.nextDouble();
                Transaction transaction=new Transaction();
                transaction.withdraw(amount,account,atm);
                break;
            case 2:
                System.out.println("Enter deposit amount:");
                amount=sc.nextDouble();
                transaction=new Transaction();
                transaction.deposit(amount,account,atm);
                transaction.checkBalance(account);
                break;
            case 3:
                transaction=new Transaction();
                transaction.checkBalance(account);
                break;
            default: System.out.println("Invalid choice");
        }
    }
}