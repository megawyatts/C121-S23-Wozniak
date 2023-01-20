package WeekTwo;
//---------------------
// Assignment #2- Task 2 TestScores
// Name: Sol Wozniak
//January 20th 2023
//*********
// This program asks the user for three test score numbers
// It then adds all three together and divides by 3 to get the average.
//The program then runs the number through an If statement to find out what letter grade it is.
//It prints both the average, and the letter grade.
//************************************

//************************************
// Class: TestScores  : : main()
//Parameters:None
//No Functions
//*************

import java.util.Scanner;
//import java.util.ArrayList;
public class TestScores {
    public static void main(String[] args){
        double score1;
        double score2;
        double score3;
        double average;
        //ArrayList<Double> scoresList= new ArrayList<>();
        Scanner keyboard= new Scanner(System.in);

        System.out.println("Enter your first test score as a number.");
        score1=Double.parseDouble(keyboard.nextLine());
        System.out.println("Enter your second test score as a number.");
        score2=Double.parseDouble(keyboard.nextLine());
        System.out.println("Enter your third test score as a number.");
        score3=Double.parseDouble(keyboard.nextLine());
        //Assigning the scores to the list
       // scoresList.add(score1);
        //scoresList.add(score2);
       // scoresList.add(score3);

        //Average
        average=(score1+score2+score3)/3;
        System.out.printf("Your average test Score is %.2f!",average);
        if(average<60){
            System.out.print("Your average test score has a grade of a F");
        } else if (average<=69){
            System.out.print("Your average test score has a grade of a D");
        }else if(average<=79){
            System.out.print("Your average test score has a grade of a C");
        }else if(average<=89){
            System.out.print("Your average test score has a grade of a B");
        }else{
            System.out.print("Your average test score has a grade of an A");
        }
        //IGNORE I did not Read the directions and thought it said I had to convert every score into a Letter Grade
        //I don't want to get delete it, because this was good practice, so I just ask that you ignore this.
        //Letter grade for each

        //Unfinished
//        scoresList.forEach(
//                x->{
//                    if(x<=60){
//                        System.out.printf("You're test score of %d is an F grade",x);
//                    }else if(x<=69){
//                        System.out.printf("You're test score of %d is an D grade",x);
  //                  }else if(x<=79){
  //                      System.out.printf("You're test score of %d is an C grade",x);
//                    }else if(x<=89){
//                        System.out.printf("You're test score of %d is an B grade",x);
//                    }
//                });

    }
}
