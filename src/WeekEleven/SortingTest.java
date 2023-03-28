package WeekEleven;

public class SortingTest {
    public static void main(String[] args){
        int[] array={4,7,9,1,2,6,8,12,43};
        Sorting sorter=new Sorting();
        sorter.mergeSort(array);
        printArray(array);
    }
    public static void printArray(int[] array){
        for(int num: array){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
