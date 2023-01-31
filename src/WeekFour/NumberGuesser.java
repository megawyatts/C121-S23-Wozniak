package WeekFour;
import java.util.Random;
import java.util.Scanner;
public class NumberGuesser {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        Random random = new Random();
        int targetInt=random.nextInt(101);
        int userGuess;

        System.out.println("Give me a number between 1 and 100 and i'll tell you whether you're higher or lower than the number i'm thinking of.");
        userGuess=Integer.parseInt(keyboard.nextLine());
        while (userGuess!=targetInt){
            if (userGuess<targetInt){
                System.out.println("Your number was lower than my number. Try Again.");
                userGuess=Integer.parseInt(keyboard.nextLine());
            }else{
                System.out.println("Your number was higher than my number. Try Again.");
                userGuess=Integer.parseInt(keyboard.nextLine());
            }
        }
        System.out.printf("You're correct! My number was "+targetInt+"! Thank you for playing.");

    }
}
