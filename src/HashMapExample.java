import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] arg){

        HashMap<String, Double> basket = new HashMap<>();

        basket.put("Apple", 10.3);
        basket.put("Orange", 13.3);
        basket.put("Pineapple", 10.3);
        basket.put("Jackfruit", 10.3);

        for(String fruit: basket.keySet()){
            System.out.println(fruit + " : " + basket.get(fruit));
        };

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the fruit you like to search in basket: ");
        String checkFruit = scanner.nextLine();

        checkFruit = checkFruit.substring(0,1).toUpperCase() + checkFruit.substring(1).toLowerCase();

        if(basket.containsKey(checkFruit)){
            System.out.println(checkFruit + " is already in your basket");
        }else {
            System.out.println(checkFruit + " needs to be added");
        }

        scanner.close();

    }
}
