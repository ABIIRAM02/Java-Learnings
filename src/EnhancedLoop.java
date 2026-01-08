import java.util.Scanner;

public class EnhancedLoop {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many items you did like to eat ? ");
        int items = scanner.nextInt();
        scanner.nextLine();

        String[] foods = new String[items];

        for(int i = 0; i < items; i++){
            System.out.print("Enter your food: ");
            foods[i] = scanner.nextLine();
        }

        for(String value : foods){
            System.out.println(value);
        }

        scanner.close();
    }

    static void enhancedLoop(){
        //Enhanced loop
        String[] fruits = {"apple", "banana", "mango", "grape", "jackfruit"};

        for(String value : fruits){
            System.out.println(value);
        }
    }

}
