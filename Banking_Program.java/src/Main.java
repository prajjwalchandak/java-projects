import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        int choice;

            System.out.println("*******************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*******************");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");

        while(isRunning){

            System.out.println("ENTER YOUR CHOICE(1-4): ");
            choice = sc.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit(balance);
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE ");
            }
        }
        System.out.println("THANK YOU HAVE A NICE DAY");
        sc.close();
    }
    static void showBalance(double balance){
        System.out.println("*******************");
        System.out.printf("₹%.2f\n" , balance);

    }
    static double deposit(double balance){

        double amount;
        System.out.println("ENTER AN AMOUNT TO BE DEPOSITED: ");
        amount = sc.nextDouble();
        if (amount<0){
            System.out.println("AMOUNT CAN NOT BE NEGATIVE ");
            return 0;
        }else{
            System.out.println(amount+ " AMOUNT DEPOSITED TO YOUR ACCOUNT");
            balance += amount;
            System.out.println("*************************");
            System.out.println("CURRENT BALANCE: "+balance);
            System.out.println("*************************");

            return amount;
        }

    }
    static double withdraw(double balance){
        double amount;
        System.out.println();
        System.out.println("ENTER AN AMOUNT TO BE WITHDRAWN: ");
        amount = sc.nextDouble();
        if (amount > balance){
            System.out.println("INSUFFICIENT BALANCE");
            return 0;
        } else if (amount<0 ) {
            System.out.println("AMOUNT CAN NOT BE NEGATIVE");
            return 0;
        } else {
            System.out.println(amount+ " AMOUNT WITHDRAWN FROM YOUR ACCOUNT");
            balance -= amount;
            System.out.println("*************************");
            System.out.println("CURRENT BALANCE: "+balance);
            System.out.println("*************************");

            return amount;
        }

    }
}