package WeekThree;

import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[]args){
        int inputNumb;
        int modulusResult;
        Scanner keyboard= new Scanner(System.in);

        System.out.println("Give me a number, and I'll tell you if it's even or odd");
        inputNumb = Integer.parseInt(keyboard.nextLine());
        modulusResult=inputNumb%2;
        if (modulusResult==0){
            System.out.println("The Number you gave me is even!");

        } else{
            System.out.println("The Number you gave me is odd!");
        }

    }
}
