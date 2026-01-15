import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AudioPlayer {

    public static void main(String[] arg){

        String filePath = "src\\F16.wav";
        File file = new File(filePath);
        Scanner scanner = new Scanner(System.in);

        try{

            AudioInputStream audioPlayer = AudioSystem.getAudioInputStream(file);
            Clip controller = AudioSystem.getClip();

            controller.open(audioPlayer);

            String responce = "";
            do{
                System.out.println("P = PLAY");
                System.out.println("S = STOP");
                System.out.println("R = REPLAY");
                System.out.println("Q = QUIT");

                System.out.print("Enter an option: ");
                responce = scanner.next().toUpperCase();

                switch (responce){
                    case "P" -> {
                        controller.start();
                        System.out.println("Playing!");
                    }
                    case "S" -> {
                        controller.stop();
                        System.out.println("Music has been stopped");
                    }
                    case "R" -> {
                        controller.setMicrosecondPosition(0);
                        System.out.println("Replaying");
                    }
                    default -> {
                        System.out.println("Invalid option");
                    }
                }

            }while(!responce.equals("Q"));

        }
        catch (IOException e){
            System.out.println("failed or interrupted I/O operations.");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("file did not contain valid data of a recognized file type and format.");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Bye");
        }

        scanner.close();

    }
}
