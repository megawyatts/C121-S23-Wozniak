package BinarySearches;
import java.util.ArrayList;
public class BinarySearchDemo {
    public int binarySearch(int key,int[] arrayList){
        int counter=0;
        int low=0;
        int high=arrayList.length-1;
        int mid=(low+high)/2;

        for(int n; arrayList){
            System.out.println(n+" ");
        }

        while (low<=high && arrayList[mid]!=key){
            if(arrayList[mid]<key){
                if (arrayList[mid]<key){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
                mid=(low+high)/2;
                System.out.printf("comparison %d:\t",++counter);
                for (int i=low;i<=high;i++){
                    System.out.print(arrayList[i]+" ");
                }
                System.out.printf("\n\tLow Index: %d (%d)\tMid Index: %d (%d)\tHigh Index: %d (%d)\n\n",
                        low,arrayList[low],mid,arrayList[mid],high,arrayList[high]);
            }
            if (low>high){// if not found
                mid= -1;
            }
            return mid;
        }
    }
}
