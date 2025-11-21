import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main (String[] args){

        String[] choice = {"rock", "paper","scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain="yes";
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("make a move(rock, paper, scissor): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock")&&!playerChoice.equals("paper")&&!playerChoice.equals("scissor")){
                System.out.println("invalid choice");
                continue;
            }

            computerChoice = choice[random.nextInt(3)];
            System.out.println("computers choice "+computerChoice);
            if(playerChoice.equals(computerChoice)){
                System.out.println("it's a tie!");

            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissor")) || (playerChoice.equals("paper") && computerChoice.equals("rock")) || (playerChoice.equals("scissor") && computerChoice.equals("paper"))) {
                System.out.println("you win!");
            }

            else {
                System.out.println("you loose!");
            }
            System.out.print("play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        }while (playAgain.equals("yes"));

    }
}








//        System.out.println(average(1,2,3,4,5));
//    static double average(double ... numbers){
//        double sum=0;
//        for (double number : numbers){
//            sum += number;
//        }
//        return sum/numbers.length ;
//    }
//    public static int add(int... numbers){
//        int sum = 0;
//        for(int number : numbers){
//            sum += number;
//        }
//        return sum;
//    }
//**********************************************************************************
//        String[] fruits = {"apple","banana","mango","pineapple","grapes"};
//        int[] numbers = {1,5,4,7,8,6,9,2,3};
//        Scanner scanner = new Scanner(System.in);
//        int target;
//        System.out.print("enter a number to be searched ");
//        target = scanner.nextInt();
//
//        for(int i=0;i< fruits.length; i++){
//            if(target == numbers[i]){
//                System.out.println("found at index "+i);
//            }
//        }
//        __________________________________________________________________________________
//        **********************************************************************************
//        Scanner scnr = new Scanner(System.in);
//        int size ;
//        System.out.print("enter the number of inputs u want ");
//        size = scnr.nextInt();
//        scnr.nextLine();
//        String[] foods = new String[size];
//
//
//        for (int i = 0; i< foods.length; i++){
//            System.out.print("enter your item ");
//            foods[i]=scnr.nextLine();
//        }
//
//        for(String food: foods){
//            System.out.print(food+" ");
//        }



