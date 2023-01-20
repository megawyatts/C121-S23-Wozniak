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
