import java.util.Scanner;

public class Main{
    public static void main(String[] arg){

        String name;
        int age;
        boolean isExperienced;
        double years = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hay, there. your name? ");
        name = scanner.nextLine();

        System.out.print("your age? ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("are you experienced? (Yes/No) ");
        String ans = scanner.nextLine();

        if(ans.equals("Yes")){
            isExperienced = true;
        }else{
            isExperienced = false;
        }

        if(isExperienced){
            System.out.print("years of exp? ");
            years = scanner.nextDouble();
        }

        if(isExperienced){
            System.out.println("Your info: " + name + ", " + age + " years old " + "with " + years + " of experience");
        }else{
            System.out.println("Your info: " + name + ", " + age + " years old " + "with " + "no working experience");
        }


        scanner.close();

    }
}