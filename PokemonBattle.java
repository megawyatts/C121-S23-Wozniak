import javax.swing.JOptionPane;
import java.util.Random;
public class PokemonBattle {
    public static void main(String[]args) {
        String pokemonName1;
        String pokemonName2;
        int hp1=1;
        int hp2=1;
        String move1;
        String move2;
        int movePow1; //Move Power
        int movePow2;// move power
        int moveSpd1;// Attack Speed for player 1
        int moveSpd2;//Attack Speed for player 2
        int rounds;
        int points1 = 0;
        int points2 = 0;
        String textbox;

        JOptionPane.showMessageDialog(null, "Welcome to Pokemon Battle Simulator!\nTwo players will compete in an odd number of rounds against eachother.\nFor every round won, the winning player will get a point. Whoever has the most points wins!");
        rounds = Integer.parseInt(JOptionPane.showInputDialog("Enter an odd number of rounds:"));
        while (true) { //will loop until Player gives odd number
            if (rounds % 2 == 0) {
                rounds = Integer.parseInt(JOptionPane.showInputDialog("That wasn't an odd number. Please Enter an odd number of rounds:"));
            }else{
                break;
            }
        }
        for(int i=0;i<rounds;i++){
            //getting Player one's stats
            pokemonName1 = JOptionPane.showInputDialog("Player 1: What is the name of your pokemon?");
            hp1 = Integer.parseInt(JOptionPane.showInputDialog("What is the hit points of your pokemon, " + pokemonName1 + "?"));
            move1 = JOptionPane.showInputDialog("What is the name of the move that " + pokemonName1 + " is performing?");
            movePow1 = Integer.parseInt(JOptionPane.showInputDialog("What is the power for the move; " + move1 + " performed by " + pokemonName1 + "?"));
            moveSpd1 = Integer.parseInt(JOptionPane.showInputDialog("What is the speed of the move: " + move1 + " performed by " + pokemonName1 + "?"));
            // getting player two's stats
            pokemonName2 = JOptionPane.showInputDialog("Player 2: What is the name of your pokemon?");
            hp2 = Integer.parseInt(JOptionPane.showInputDialog("What is the hit points of your pokemon, " + pokemonName2 + "?"));
            move2 = JOptionPane.showInputDialog("What is the name of the move that " + pokemonName2 + " is performing?");
            movePow2 = Integer.parseInt(JOptionPane.showInputDialog("What is the power for the move; " + move2 + " performed by " + pokemonName2 + "?"));
            moveSpd2 = Integer.parseInt(JOptionPane.showInputDialog("What is the speed of the move: " + move2 + " performed by " + pokemonName2 + "?"));
            while ((hp1 > 0) || (hp2 > 0)) {
                //Game time
                int fPNumb = checkSpeed(moveSpd1, moveSpd2); //short for fasterPlayerNumber
                //setting up who goes second
                if (fPNumb == 2) {
                    textbox=String.format("Player Two's %s uses %s on %s dealing %d damage!", pokemonName2 , move2,pokemonName1, movePow2);
                    JOptionPane.showMessageDialog(null,textbox);
                    hp1 = hp1 - movePow2;
                    if (testHealth(hp1).equals("Down")) {
                        points2++;
                        JOptionPane.showMessageDialog(null,"Player 2 has won this round!");
                        break;
                    }else {
                        textbox=String.format("Player One's %s uses %s on %s dealing %d damage!", pokemonName1 , move1,pokemonName2, movePow1);
                        JOptionPane.showMessageDialog(null,textbox);
                        hp2 = hp2 - movePow1;
                        if (testHealth(hp2).equals("Down")) {
                            points1++;
                            JOptionPane.showMessageDialog(null,"Player 1 has won this round!");
                            break;
                        }
                    }
                } else {
                    hp2=hp2-movePow1;//player one goes first
                    textbox=String.format("Player One's %s uses %s on %s dealing %d damage!", pokemonName1 , move1,pokemonName2, movePow1);
                    JOptionPane.showMessageDialog(null,textbox);
                    if(testHealth(hp2).equals("Down")){
                        points1++;
                        JOptionPane.showMessageDialog(null,"Player 1 has won this round!");
                        break;
                    }else{
                        textbox=String.format("Player Two's %s uses %s on %s dealing %d damage!", pokemonName2 , move2,pokemonName1, movePow2);
                        JOptionPane.showMessageDialog(null,textbox);
                        hp1=hp1-movePow2;
                        if (testHealth(hp1).equals("Down")){
                            points2++;
                            JOptionPane.showMessageDialog(null,"Player 2 has won this round!'");
                            break;
                        }
                    }

                }
                textbox=String.format(pokemonName1+"'s Current Health: "+hp1+"\n");
                move1 = JOptionPane.showInputDialog(textbox+"What is the name of the move that " + pokemonName1 + " is performing?");
                movePow1 = Integer.parseInt(JOptionPane.showInputDialog(textbox+"What is the power for the move; " + move1 + " performed by " + pokemonName1 + "?"));
                moveSpd1 = Integer.parseInt(JOptionPane.showInputDialog(textbox+"What is the speed of the move: " + move1 + " performed by " + pokemonName1 + "?"));
               //player 2's stats
                textbox=String.format(pokemonName2+"'s Current Health: "+hp2+"\n");
                move2 = JOptionPane.showInputDialog(textbox+"What is the name of the move that " + pokemonName2 + " is performing?");
                movePow2 = Integer.parseInt(JOptionPane.showInputDialog(textbox+"What is the power for the move; " + move2 + " performed by " + pokemonName2 + "?"));
                moveSpd2 = Integer.parseInt(JOptionPane.showInputDialog(textbox+"What is the speed of the move: " + move2 + " performed by " + pokemonName2 + "?"));

            }
        }
        endGame(points1,points2);
    }
    public static int checkSpeed(int spd1, int spd2){
        if (spd1>spd2){
            return 1;
        }else if (spd2>spd1){
            return 2;
        }else{
            Random random=new Random();
            int tie=random.nextInt(2);
            return tie;
        }
    }
    public static String testHealth(int hp){
        if (hp<=0){
            return"Down";
        }else{
            return"Fine";
        }
    }
    public static void endGame(int points1,int points2){
        JOptionPane.showMessageDialog(null,"Fianl Scores!\nPlayer One:"+points1+" points!\nPlayer Two:"+points2+"points!");
        String winner;
        if (points1>points2){
            winner="Player 1 is the winner";
        }else if(points2>points1){
            winner="Player 2 is the winner";
        }else{
            winner="It's a tie";
        }
        JOptionPane.showMessageDialog(null,"Congratulations "+winner+"! Thank you for playing!");
    }
}
