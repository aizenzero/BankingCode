class BankAccount{
    private String accountNumber = "123abc";
    private int    password      = 123456;

    private double balance = 1000;

    BankAccount(){

    }

    BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public int getPassword(){
        return password;
    }





}