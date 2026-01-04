import java.util.Scanner;
import java.util.Random;

public class guessTheNum {

    public static  void main(String[] arg){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNum = random.nextInt(1, 11);

        int guessedNum = 0;

        System.out.println("Guess a num between 1 to 10");
        do{
            System.out.print("Enter a num: ");
            guessedNum = scanner.nextInt();

            if(guessedNum > randomNum){
                System.out.println("try smaller");
            } else if (randomNum > guessedNum) {
                System.out.println("try grater");
            }else{
                System.out.println("Guessed correct, the number is: " + randomNum);
            }

        }while(guessedNum != randomNum);

        scanner.close();
    }

}
