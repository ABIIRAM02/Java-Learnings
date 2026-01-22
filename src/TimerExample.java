import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
    public static void main(String[] arg){



        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int count = 10;

            @Override
            public void run(){
                System.out.println(count);
                count--;

                if(count <= 0){
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 1000, 1000); // takes time to execute
        timer.scheduleAtFixedRate(task, 1000, 1000); // exact time

    }
}
