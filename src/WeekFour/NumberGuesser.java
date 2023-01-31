package WeekFour;
import java.util.Random;
import java.util.Scanner;
public class NumberGuesser {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        Random random = new Random();
        int targetInt=random.nextInt(101);
        int userGuess;
        String userInput;
        int guessCount=1;

        System.out.println("Give me a number between 1 and 100 and i'll tell you whether you're higher or lower than the number i'm thinking of.\nOr enter q to quit");
        userInput=(keyboard.nextLine());
        if (userInput.equals("q")){
            userGuess=targetInt;
        }else{
            userGuess=Integer.parseInt(userInput);
            while ((userGuess!=targetInt)){
                if(userInput.equals("q")){
                    System.out.println("You quit. The number was "+targetInt);
                    break;
                }else{
                    userGuess=Integer.parseInt(userInput);
                    if(userGuess==targetInt){
                        break;
                    }
                    if (userGuess<targetInt){
                        System.out.println("Your number was lower than my number. Try Again.\nOr enter q to quit.");
                    }else{
                        System.out.println("Your number was higher than my number. Try Again.\nOr enter q to quit.");
                    }
            }
                guessCount++;
                userInput=(keyboard.nextLine());
        }}
        if(userGuess==targetInt){
            System.out.printf("You're correct! My number was "+targetInt+"! It took you "+ guessCount+" guesses to get it right!\nThank you for playing.");}

    }
}
