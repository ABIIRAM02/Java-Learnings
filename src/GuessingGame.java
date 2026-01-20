import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> fruits = loadwords();

//        for(String fruit : fruits){
//            System.out.println(fruit + " ");
//        }

        String word = fruits.get(random.nextInt(fruits.size()));

        ArrayList<Character> hintWord = new ArrayList<>();

        addHintLetters(word, hintWord);

        System.out.println("Welcome to word guessing game!!");
        System.out.println("**************");

        System.out.println("Enter any letter to start, (To Quit: Q)");

        System.out.print("Enter : ");

        String userInput = scanner.nextLine().toUpperCase();

        int attempts = 0;

        while(!userInput.equals("Q")) {
            System.out.print("\nWord to be found: ");

            printArrayList(hintWord);

            System.out.print("\nGuess the word: ");
            userInput = scanner.nextLine();

            attempts++;
            if (userInput.length() == word.length()) {
                int guessedUpto = 0;

                for (int i = 0; i < userInput.length(); i++) {

                    if (userInput.charAt(i) == word.charAt(i)) {
                        hintWord.set(i, userInput.charAt(i));
                        guessedUpto++;
                    }

                }
                if(hintWord.contains('_')){

                    System.out.print("\n" + guessedUpto + " letters matched\nresult: ");
                    printArrayList(hintWord);
                    System.out.print("\n");
                    System.out.println("\nTo Quit: Q");
                    
                }else{

                    System.out.println("\nCongrats you found all the letters!, Total attempts - "+ attempts);
                    break;

                }
            } else {
                if(userInput.equals("Q")){
                    System.out.println("Quited successfully");
                }else{
                    System.out.println("Enter the word that matches the length of guessing word");
                }
            }

        };

        scanner.close();

    }

     static ArrayList<String> loadwords(){

         String filepath = "src\\words.txt";

         ArrayList<String> fruits = new ArrayList<>();

         try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
             String line;
             while((line = reader.readLine()) != null){
                 fruits.add(line.trim());
             }
         }catch (FileNotFoundException e){
             System.out.println("Can't able to file the filepath");
         }catch (IOException e){
             System.out.println("Something went wrong");
         }catch (Exception e){
             System.out.println("Fault in program");
         }

         return fruits;
    }

     static void addHintLetters(String word, ArrayList<Character> hintWord){
        for(int i=0; i < word.length(); i++){
            if(i == 1){
                hintWord.add(i, word.charAt(i));
            } else if (i == word.length() -1) {
                hintWord.add(i, word.charAt(i));
            }else{
                hintWord.add(i, '_');
            }
        }
    }

     static void printArrayList(ArrayList<Character>hintWord){
         for (char letter : hintWord) {
             System.out.print(letter + " ");
         }
     }
}
