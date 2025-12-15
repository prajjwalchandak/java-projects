import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String filePath = "F:\\JAVA\\projects\\HangManGame\\src\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }catch (Exception e){
            System.out.println(e);
        }

        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuess = 0;

        for(int i = 0 ; i<word.length();i++){
            wordState.add('_');
        }

        System.out.println("***********************");
        System.out.println("welcome to hangman game");
        System.out.println("***********************");

        while(wrongGuess < 6){

            System.out.print("word: ");

            for(char c : wordState){
                System.out.print(c+" ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if(word.indexOf(guess)>=0){
                System.out.println("correct guess\n");

                for (int i=0;i<word.length();i++){
                    if (word.charAt(i)==guess){
                        wordState.set(i,guess);
                    }
                }

                if(!wordState.contains('_')){
                    System.out.println(wrongGuess);
                    System.out.println("you win");
                    System.out.println("the word was: "+word);
                    break;
                }

            }else{
                wrongGuess++;
                System.out.println("wrong guess\n");
            }
        }
        if(wrongGuess >= 6){
            System.out.println("game over");
            System.out.println("the word was: "+word);
        }
    }
}
