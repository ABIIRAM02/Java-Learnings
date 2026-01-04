import java.util.Scanner;

public class LoopPractice {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the num of rows to be printed ");
        int rows = scanner.nextInt();

        System.out.print("Enter the num of columns to be printed ");
        int columns = scanner.nextInt();

        System.out.print("Enter the desired symbol to be used ");
        char symbol = scanner.next().charAt(0);

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        scanner.close();

    }

}
