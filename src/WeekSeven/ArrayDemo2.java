package WeekSeven;
import java.util.ArrayList;
public class ArrayDemo2 {
    public static void main(String[] args){
        int[][] array2=new int[4][3];
        //String[][] array2={{"Persona 4: Golden","Atlus","Kanji Tatsumi"},{"Persona 3: Portable","Atlus","Hikari Tanjiro"},
              //  {"Genshin Impact","Mihoyo","Klee"},{"Stardew Valley","Gorilla","Maru"}};
        array2[0][0]=2;
        array2[0][1]=3;
        array2[0][2]=4;
        array2[1][0]=5;
        array2[1][1]=6;
        array2[1][2]=7;
        array2[2][0]=7;
        array2[2][1]=8;
        array2[2][2]=9;
        array2[3][0]=10;
        array2[3][1]=10;
        array2[3][2]=12;

        for(int row=0;row<array2.length;row++){
            for(int column=0;column<array2[row].length;column++){
                System.out.printf("%d ",array2[row][column]);
            }
            System.out.print("\n");
        }


}
}
