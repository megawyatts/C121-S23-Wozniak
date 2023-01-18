package WeekTwo;
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


        firstName=JOptionPane.showInputDialog("Enter your first name.");
        lastName=JOptionPane.showInputDialog("Enter your last Name.");
        fullName=firstName+" "+lastName;
        fullNameBackwards=lastName+" "+firstName;
        upperName=(firstName.toUpperCase())+" "+(lastName.toUpperCase());
        lowerName=(firstName.toLowerCase())+" "+(lastName.toLowerCase());
        length=fullNameBackwards.length();
        System.out.println(fullName);
        System.out.println(upperName);
        System.out.println(lowerName);
        for (int count=0;count<=length;count++)
        {
            revFullName=((fullNameBackwards.charAt(count))+revFullName);
            if (count>=length-1){
                System.out.print(revFullName);
        }
        }


    }

}
