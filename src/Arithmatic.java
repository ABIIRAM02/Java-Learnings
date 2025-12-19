import java.util.Scanner;

public class Arithmatic {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        int principalAmt;
        double intrest;
        int compoundNum;
        int howManyYears;

        double total;

        System.out.print("Enter the amount in Rs: ");
        principalAmt = scanner.nextInt();

        System.out.print("Enter the interst: ");
        intrest = scanner.nextDouble() / 100;

        System.out.print("Enter the compound number: ");
        compoundNum = scanner.nextInt();

        System.out.print("How many years needs to be invest: ");
        howManyYears = scanner.nextInt();

        // total = P * ( 1 + i/C ) ^ C * Y -- > compound intrest formula

        total = principalAmt * Math.pow(1 + intrest/compoundNum,  compoundNum * howManyYears);

        System.out.printf("Your total amt after %d years is :%,.2f\n", howManyYears, total);

        double profit = total - principalAmt;

        System.out.println("Profit : " + profit);

        scanner.close();
    }

}
