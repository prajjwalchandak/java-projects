import java.util.Scanner;

public class QuizGame{

    public static void main(String args[]) {
    //**********************************************************************************
        String[] questions = {"question 1",
                "question 2",
                "question 3",
                "question 4",
                "question 5"};

        String[][] options = {{"1. option 1","2. option 2","3. option 3","4. option 4"},
                {"1. option 1","2. option 2","3. option 3","4. option 4"},
                {"1. option 1","2. option 2","3. option 3","4. option 4"},
                {"1. option 1","2. option 2","3. option 3","4. option 4"},
                {"1. option 1","2. option 2","3. option 3","4. option 4"}};

        int[] answer = {1,4,2,3,1};
        int score = 0;
        int guess;
        Scanner scanner = new Scanner(System.in);

        System.out.println("***************");
        System.out.println("QUIZ GAME");
        System.out.println("***************");
        System.out.println("");

        for(int i = 0; i<questions.length;i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("type the option number ");
            guess = scanner.nextInt();
            if (guess == answer[i]){
                System.out.println("*************");
                System.out.println("correct");
                System.out.println("*************");
                System.out.println("");
                score++;
            }else {
                System.out.println("*******");
                System.out.println("wrong");
                System.out.println("*******");
                System.out.println("");
            }
        }
        System.out.println( "your score is "+score+" out of "+questions.length );
    }
}


