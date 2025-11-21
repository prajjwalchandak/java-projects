import java.util.Random;
import java.util.Scanner;

public class DiceRoll {

    public static void main(String[] args) {
        int number;
        int total = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);


//input the number of rolls
        System.out.print("enter the number of dice roll: ");
        number = sc.nextInt();

        if (number > 0) {
            for (int i = 0; i <= number - 1; i++) {
                int randomNumber = random.nextInt(1, 7);
                System.out.println((i + 1) + "). " + randomNumber);
                total += randomNumber;
            }
            System.out.println("total sum of outcome is: " + total);
        } else System.out.println("enter greater number");
    }
}
