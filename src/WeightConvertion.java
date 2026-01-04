import java.util.Scanner;

public class WeightConvertion {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Conversion Program");

        System.out.println("1: Covert lbs to kgs");
        System.out.println("2: Covert kgs to lbs");

        System.out.print("Choose an option: ");
        int option = scanner.nextInt();
        int lbs;
        int weight;
        double res;

        boolean isOption1 = option == 1;

        if(isOption1){
            System.out.print("Enter the weight in lbs: ");
             lbs = scanner.nextInt();
             res = lbs / 2.20462;

        }else{
            System.out.print("Enter the weight in kgs: ");
             weight = scanner.nextInt();
             res = weight * 2.20462;
        }

        System.out.println("The new weight in " + (isOption1 ? "KG " : "LBS ") + "is " + res );

        scanner.close();

    }

}
