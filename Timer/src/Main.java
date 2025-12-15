import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();
        System.out.println("enter the countdown(in seconds): ");
        TimerTask timerTask = new TimerTask() {

            int count = scanner.nextInt();
            @Override
            public void run() {
                System.out.println(count);
                count-- ;
                if(count<=0){
                    System.out.println("done");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(timerTask , 0,1000);

    }
}