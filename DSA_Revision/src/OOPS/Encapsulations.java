package OOPS;

class Bank {
    private long accountNumber = 4247342;
    double balance = 0;

    public void deposit(int amount) {
        if(amount > 0) {
            System.out.println("Rs " + amount + " is deposited successfully to your account...");
            balance += amount;
            System.out.println("Your current Balance is: Rs "+ balance);
        }
    }

    public void withdrawal(int amount) {
        if(amount < balance) {
            System.out.println("You have withdrawn Rs " + amount);
            balance -= amount;
            System.out.println("Remaining balance is: Rs " + balance);
        }
        else System.out.println("Invalid or insufficient balance");
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}
public class Encapsulations {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        double bal = b1.balance;
        System.out.println(bal);
//        b1.accountNumber; // Can't access it directly as it is private can access it only through getter method
        b1.deposit(1000);
        b1.withdrawal(200);
        long accountNumber = b1.getAccountNumber();
        System.out.println(accountNumber);
    }
}
