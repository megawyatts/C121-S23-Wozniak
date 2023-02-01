package WeekFour;

import java.util.Scanner;
import java.util.Random;
public class ESPGame {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        Random random=new Random();
        String guess;
        int compChoice;
        String compColor="black";
        int score=0;

        for(int i=1;i<=10;i++){
            compChoice=random.nextInt(5);
            switch(compChoice){
                case 0:
                    compColor="red";
                    break;
                case 1:
                    compColor="green";
                    break;
                case 2:
                    compColor="blue";
                    break;
                case 3:
                    compColor="orange";
                    break;
                case 4:
                    compColor="yellow";
                    break;
                default:
                    break;
            }
            System.out.println("What color has the computer chosen?");
            guess=keyboard.nextLine();
            if (compColor.equals(guess)){
                score+=1;
            }
            System.out.println("The Computer guessed "+compColor+".");
        }
        System.out.println("You guessed "+score+" out of 10 correctly.");

    }
}
