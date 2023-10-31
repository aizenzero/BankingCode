public class MyAccount extends  BankAccount{

    private String accountNumber;

    private double balance = 1000;



    public void deposit(double amount) {
        balance += amount;
        System.out.println("\n---------------Successfully deposit--------------------");
        System.out.println("Your current balance is "+balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("\n--------------------Successfully withdraw------------------");
            System.out.println("Your current balance is "+ balance);
        } else {
            System.out.println("----------------Insufficient balance-------------");
        }
    }

}
