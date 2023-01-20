package WeekTwo;
//---------------------
// Assignment #1- Task 2
// Name: Sol Wozniak
//January 20th 2023
//*********
// This program takes two number inputs from the user, and then performs 7 math functions
// Then it 1.adds, 2.subtracts, 3.multiples and 4.divides the two numbers together.
// 5.It takes the added total of both numbers and then square roots them.
// 6. It totals the result of the first number to the power of the second
// and 7. it logs the first number by the second number.
// then it prints every result for the seven functions.
//************************************

//************************************
// Class: NumberInput  : : main()
//Parameters:None
//No Functions
//*************


import java.util.Scanner;
import java.lang.Math;
public class NumberInput {
    public static void main(String[] args){
        int numb1;
        int numb2;
        int bigNumb;
        int smallNumb;
        int total;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a number.");
        numb1=Integer.parseInt(keyboard.nextLine());
        System.out.println("Give Me Another Number.");
        numb2=Integer.parseInt(keyboard.nextLine());
        // addition
        total=numb1+numb2;
        System.out.println("When added your two numbers equal= "+total);
        //subtract
        bigNumb=Math.max(numb1,numb2);
        smallNumb=Math.min(numb1,numb2);
        System.out.println("When subtracted your two numbers equal= "+(bigNumb-smallNumb));
        //Multiply
        System.out.println("When multiplied your two numbers equal= "+(numb1*numb2));
        //Divide
        System.out.println("When divided your two numbers equal= "+(bigNumb/smallNumb));
        // square root
        System.out.println("When added and square rooted, your two numbers equal= "+(Math.sqrt(total)));
        //Power
        System.out.println("When your first number is put to the power of your second number they equal= "+(Math.pow(numb1,numb2)));
        //Logrithim
        System.out.println("When you log your first number by the second number, they equal= "+(Math.log((double)numb1/numb2)));






    }
}
