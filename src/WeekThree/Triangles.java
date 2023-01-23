package WeekThree;

import java.util.Scanner;
public class Triangles {
    public static void main(String[]args){
        int side1;
        int side2;
        int side3;
        Scanner keyboard=new Scanner(System.in);

        System.out.println("Give me the length of the first side.");
        side1=Integer.parseInt(keyboard.nextLine());
        System.out.println("Give me the length of the second side.");
        side2=Integer.parseInt(keyboard.nextLine());
        System.out.println("Give me the length of the third side.");
        side3=Integer.parseInt(keyboard.nextLine());

        if((side1==side2)&&(side2==side3)&&(side3==side1)){
            System.out.println("The Triangle you made is an Equilateral triangle!");
        }else if((side1==side2)||(side2==side3)||(side3==side2)){
            System.out.println("The Triangle you made is an Isosceles Triangle!");
        } else{
            System.out.println("The Triangle you made is a Scalene Triangle!");
        }
    }
}
