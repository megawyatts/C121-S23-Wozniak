package WeekTwo;
//---------------------
// Assignment #1- Task 2
// Name: Sol Wozniak
//January 20th 2023
//*********
// This program gets the user's input in how many books they bought this month.
// Then the input's variable is sorted through an if statement measuring how large the number is.
// When the if statement successfully finds how many points the user earned, it prints how many points they earned.
//************************************

//************************************
// Class: BookClubPoint  : : main()
//Parameters:None
//No Functions
//*************

import java.util.Scanner;
public class BookClubPoint {
    public static void main(String[] args){
        int books;
        int points;
        points=0;

        Scanner keyboard=new Scanner(System.in);

        System.out.println("How many books did you purchase this month?");
        books=Integer.parseInt(keyboard.nextLine());

        if (books<=0){
            points=0;
        } else if (books==1){
            points=1;
        } else if (books==2){
            points=15;
        } else if (books==3){
            points=30;
        } else if (books>=4){
            points=60;
        }
        System.out.printf("You purchased "+books +" books, so you earned "+ points+" points!");



    }
}
