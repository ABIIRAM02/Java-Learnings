import java.util.Scanner;

public class BankingWithMethods {

    static Scanner scanner = new Scanner(System.in);
    static double balance;

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Abii international banking\n**********\n1. Show Balance\n2. Deposit\n3. Withdraw\n4. Exit\n**********");
            System.out.print("Enter your choice(1-4): ");
        choice = scanner.nextInt();

        switch (choice){
            case 1 -> checkBalance();
            case 2 -> deposit();
            case 3 -> withDraw();
            case 4 -> System.out.println("Thank you, visit again!");
            default -> System.out.println("Enter the valid option");
        }}while(choice != 4);

        scanner.close();

    }

    static void deposit(){

        System.out.print("Enter the amount to be deposit: ");
        double amt = scanner.nextDouble();

        balance += amt;

        System.out.print("\nAmount added successfully\n\n");

    };

    static void checkBalance(){

        System.out.print("\nYour balance: " + balance + "\n\n");

    };

    static void withDraw(){
        System.out.print("Enter the amount to withdraw ");
        double amt = scanner.nextDouble();

        balance -= amt;

        System.out.println("\nsuccessfully took\n");
    }

}
