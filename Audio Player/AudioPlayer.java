import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Scanner;

class AudioPlayer {
    public static void main(String[] args){
        String filePath = "good for the ghost.wav";
        File file = new File(filePath);

        try(Scanner sc = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String response="";

            while (!response.equals("Q")){
                System.out.println(" P = Play");
                System.out.println(" S = Stop");
                System.out.println(" R = Replay");
                System.out.println(" Q = Quit");
                System.out.print("Enter your choice: ");

                response = sc.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("invalid choice");
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }
}