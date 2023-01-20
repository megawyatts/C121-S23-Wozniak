package WeekTwo;
// Assignment #1- Task One
// Name: Sol Wozniak
//January 20th 2023
//*********
// This program asks the user to input their first and Last NAme, and then assigns them to two variables.
// It then shows in a Dialog box, the user's full name, as they entered it, in lowercase letters, and in uppercase letters.
// It then reverses the letters of the first and last name, but still puts them in "firstName lastName" order
//The Dialog box is used to gather input and show output.
// An If statement is used when reversing the letters so that the name is printed when it is finished.
//************************************

//************************************
// Class: NumberInput  : : main()
//Parameters:None
//No Functions
//*************
import javax.swing.JOptionPane;
public class Scanner {
    public static void main(String[]args){
        String firstName;
        String lastName;
        String upperName;
        String lowerName;
        String fullName;
        int length;
        String fullNameBackwards;
        String revFullName="";


        firstName=JOptionPane.showInputDialog(null,"Enter your first name.");
        lastName=JOptionPane.showInputDialog(null,"Enter your last Name.");
        fullName=firstName+" "+lastName;
        fullNameBackwards=lastName+" "+firstName;
        upperName=(firstName.toUpperCase())+" "+(lastName.toUpperCase());
        lowerName=(firstName.toLowerCase())+" "+(lastName.toLowerCase());
        length=fullNameBackwards.length();
        JOptionPane.showMessageDialog(null,fullName);
        JOptionPane.showMessageDialog(null,upperName);
        JOptionPane.showMessageDialog(null,lowerName);
        for (int count=0;count<=length;count++)
        {
            revFullName=((fullNameBackwards.charAt(count))+revFullName);
            if (count>=length-1){
                JOptionPane.showMessageDialog(null,revFullName);
        }
        }


    }

}
