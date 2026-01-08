public class VariableArguments {

    public static void main(String[] arg){
        double average = findAverage(1,2,3,4,5,6,7);
        System.out.println("The average of given numbers are: " + average);
    }

    static double findAverage(double ... numbers){

        double sum = 0;
        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;

    }

}
