package WeekTwelve;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
public class SetsAndIterators {
    public static void main(String[] args){
        Set<Integer> set= new HashSet<>();
        int[] intArray={5,67,34,23,12,98,3};

        // a set will get rid of any dublicate numbers
        set.add(45);
        set.add(56);
        for (int numb : intArray){
            set.add(numb);
        }
        //System.out.println(set);
        //System.out.println(set.size());


        TreeSet<Integer> sortedSet= new TreeSet<>(set);//creates a new sorted tree set

        System.out.print("Sorted set: ");
        for(int elem: sortedSet){
            System.out.printf(elem+" ");
        }
        System.out.println("First Part: "+sortedSet.first());

    }
}
