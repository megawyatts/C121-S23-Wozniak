package WeekSeven;

public class ForEach {
    public static void main(String[] args){
        String[]names={"Mary","Tom","John","Jane","Lisa"};

        for(String name: names){
            System.out.printf("%s\n",name);
        }
        // multidimensional arrays
        int[][] array1={{1,2,3},{4,5,6}};
        for(int row=0;row<array1.length;row++){
            for(int column=0;column<array1[row].length;column++){
                System.out.printf("%d",array1[row][column]);
            }
            System.out.println();
        }
    }
}
