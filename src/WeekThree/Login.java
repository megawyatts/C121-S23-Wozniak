package WeekThree;

import javax.swing.JOptionPane;
public class Login {
    public static void main(String[]args){
        String userName;
        String password;
        String inputUserName;
        String inputPassword;

        userName=JOptionPane.showInputDialog("Create A Username");
        password=JOptionPane.showInputDialog("Create a Password");

        //input username and password section
        inputUserName=JOptionPane.showInputDialog("Enter a Username");
        inputPassword=JOptionPane.showInputDialog("Enter a password");

        if ((userName.equals(inputUserName))&&(password.equals(inputPassword))){
            JOptionPane.showMessageDialog(null,"Welcome to CS121.");
        } else if (userName.equals(inputUserName)){
            JOptionPane.showMessageDialog(null,"The Password did not match the Username");
        }else if (password.equals(inputPassword)){
            JOptionPane.showMessageDialog(null,"The Username does not match the password");
        } else{
            JOptionPane.showMessageDialog(null,"Niether the Username or the Password matched the logged username and password.");
        }

    }
}
