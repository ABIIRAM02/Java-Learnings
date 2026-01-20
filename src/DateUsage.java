import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUsage {

    public static void main(String[] arg){

        LocalDate date = LocalDate.now();

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formatedDate = dateTime.format(formater);

        System.out.println(formatedDate);

    }
}
