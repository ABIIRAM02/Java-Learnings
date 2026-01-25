import java.util.Scanner;

public class ThreadingExample {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'HAIL ABII' with in 10 seconds");

        MyRunable myRunable = new MyRunable(); // background task (timer)
        Thread thread = new Thread(myRunable);
        thread.setDaemon(true); // stops when the main program ends
        thread.start();

        System.out.print("Enter :");
        String input = scanner.nextLine().toUpperCase();

        while (!input.equals("HAIL ABII")){
            System.out.print("Enter: ");
            input = scanner.nextLine().toUpperCase();
        }

        System.out.println("abii let you live");


    }
}
