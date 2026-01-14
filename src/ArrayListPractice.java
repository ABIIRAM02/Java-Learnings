import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> movies  = new ArrayList<>();

        System.out.print("Enter the # you did like to add: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i=0; i<num; i++){
            System.out.print("Enter your fav movie #" + (i + 1) + " : ");
            String book = scanner.nextLine();
            movies.add(book);
        }

        movies.set(0, "Top gun maverick");
        movies.set(1, "Soorarai potru");

        System.out.println("Successfully added fav movies: " + movies);

        scanner.close();
    }
}
