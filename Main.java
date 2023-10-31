import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);
                BankAccount b = new BankAccount();

                System.out.println("------------------Login----------------");

                int maxAttempts = 3;
                int attempts = 0;
                boolean loginSuccessful = false;

                while (attempts < maxAttempts) {
                    System.out.print("What is your account number: ");
                    String account = input.next();

                    System.out.print("What is your password: ");
                    int password = input.nextInt();

                    if (account.equals(b.getAccountNumber()) && password == b.getPassword()) {
                        loginSuccessful = true;
                        break;
                    } else {
                        System.out.println("Incorrect account number or password. Please try again.");
                        attempts++;
                    }
                }

                if (loginSuccessful) {
                    MyAccount m = new MyAccount();
                    System.out.println("\n-----------------Welcome-----------------\n");

                    do {
                        System.out.println("What do you want to do (Press the number): ");
                        System.out.println("1. Balance");
                        System.out.println("2. Withdraw");
                        System.out.println("3. Deposit");

                          int answer = input.nextInt();

                    switch (answer) {
                        case 1:
                            System.out.println("Your balance is " + b.getBalance());
                            break;
                        case 2:
                            System.out.println("How much do you want to withdraw?");
                            double withdraw = input.nextDouble();

                            m.withdraw(withdraw);

                            break;
                        case 3:

                            System.out.print("How much do you want to deposit: ");
                            int deposit = input.nextInt();
                            m.deposit(deposit);

                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }

                    System.out.print("Do you want to continue (Y/N): ");
                    char answer1 = input.next().toUpperCase().charAt(0);

                    if (answer1 != 'Y') {
                        break;
                }
                    } while (true);

                    System.out.println("\n-----------------Thank you for using the banking app!---------------------");
                } else {
                    System.out.println("Login failed after " + maxAttempts + " attempts. Account locked.");
                }
    }
}

