import java.util.Scanner;

public class QuizGame {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "1. who is the PM in india",
                "2. who is the future CM in tamilnadu",
                "3. which is one of the democrazy line",
                "4. which is the capital of tamilnadu",
                "5. which is the vijay's last movie"
        };

        int[] answers = { 2,1,3,3,3 };

        String[] option1 = {
                "1. Trump",
                "2. Modi",
                "3. putin",
                "4. hitler"
        };
        String[] option2 = {
                "1. Thalapathy vijay",
                "2. Stalin",
                "3. EPS",
                "4. Seeman"
        };
        String[] option3 = {
                "1. people requirement",
                "2. globel equality",
                "3. for the people",
                "4. national trading"
        };
        String[] option4 = {
                "1. Tuty",
                "2. Madurai",
                "3. Chennai",
                "4. Trichy"
        };
        String[] option5 = {
                "1. Thupaki",
                "2. Kaththi",
                "3. Jananayagan",
                "4. Billa"
        };

        String[][] options = { option1, option2, option3, option4, option5 };

        System.out.println("Welcome to java quiz game\n**********");
        System.out.print("Enter 5 to start: ");
        int isStart = scanner.nextInt();

        if(isStart == 5){

            for(int i = 0; i < questions.length; i++){

                System.out.println(questions[i]);

                for(String option: options[i] ){
                    System.out.println(option);
                }

                System.out.print("Enter the option: ");
                int userChoise = scanner.nextInt();

                while(userChoise > 4 || userChoise < 1){
                    System.out.print("Enter a valid option: ");
                    userChoise = scanner.nextInt();
                }

                if(userChoise == answers[i]){
                    System.out.println("CORRECT ANSWER!!");
                }else {
                    System.out.println("WRONG ANSWER");
                }

            }

        }
        scanner.close();
    }
}
