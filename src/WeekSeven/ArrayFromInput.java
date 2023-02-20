package WeekSeven;
import java.util.Scanner;
public class ArrayFromInput {
    public static void main(String[]args){
        String[] title=new String[3];
        int[] chapters=new int[3];
        String[] author=new String[3];
        Scanner keyboard=new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.printf("What is the name of book %d?\n",i+1);
            title[i]=keyboard.nextLine();
            System.out.printf("How many chapters does %s have?\n",title[i]);
            chapters[i]=Integer.parseInt(keyboard.nextLine());
            System.out.printf("Who is the author of your boook: %s?\n",title[i]);
            author[i]=keyboard.nextLine();
        }
        System.out.print("Book Title     Chapters     Book Author\n");
        for(int j=0;j<3;j++){
            System.out.printf("%s     %d        %s\n",title[j],chapters[j],author[j]);
        }

    }
}
