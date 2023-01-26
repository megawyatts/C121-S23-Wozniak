package WeekThree;

import javax.swing.JOptionPane;
public class SwitchActivity {
    public static void main(String[]args){
        String vocaloidName;

        vocaloidName=JOptionPane.showInputDialog(null,"Give me a Vocaloid, and I'll tell you about them\nMiku, Rin, Len, Luka, Meiko, Kaito."); //answers can be: Miku, Rin, Len, Meiko, Kaito, and Luka

        switch(vocaloidName){
            case "Miku":
                JOptionPane.showMessageDialog(null,"Name: Hatsune Miku\nVoice Provider: Saki Fujita \nInitial Engine: V2\nReleased: August 31st 2007");
                break;
            case "Len":
                JOptionPane.showMessageDialog(null,"Name: Kagamine Len\nVoice Provider: Asami Shimoda \nInitial Engine: V2\nReleased: December 27th 2007");
                break;
            case"Rin":
                JOptionPane.showMessageDialog(null,"Name: Kagamine Rin\nVoice Provider: Asami Shimoda \nInitial Engine: V2\nReleased: December 27th 2007");
                break;
            case"Luka":
                JOptionPane.showMessageDialog(null,"Name: Megurine Luka\nVoice Provider:Yu Asakawa \nInitial Engine: V2\nReleased: January 30th 2009");
                break;
            case "Meiko":
                JOptionPane.showMessageDialog(null,"Name: MEIKO\nVoice Provider: Meiko Haigo \nInitial Engine: V1\nReleased: November 5th 2004");
                break;
            case "Kaito":
                JOptionPane.showMessageDialog(null,"Name:KAITO\nVoice Provider: Naoto Fuga \nInitial Engine: V1\nReleased: February 14th 2006");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Sorry, I don't know that one!");
                break;
            }
    }
}
