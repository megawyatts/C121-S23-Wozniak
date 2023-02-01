package WeekFour;

import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args){
        int studentCount;
        int testCount;
        int input;
        int testScores;
        Scanner keyboard=new Scanner(System.in);

        System.out.print("How many students?");
        studentCount=Integer.parseInt(keyboard.nextLine());
        System.out.print("How many tests did the students take?");
        testCount=Integer.parseInt(keyboard.nextLine());

        for(int i=1;i<=studentCount;i++){
            System.out.println("Student "+i+"\n_______________\n");
            testScores=0;
            for(int j=1;j<=testCount;j++){
                System.out.println("What did Student "+i+" Get on Test "+j+":");
                input=Integer.parseInt(keyboard.nextLine());
                testScores+=input;
                if (j==testCount){
                    testScores=testScores/testCount;
                    System.out.println("Student "+i+"'s Average Test Score is "+testScores+"\n\n");
                }
            }
        }

    }
}
