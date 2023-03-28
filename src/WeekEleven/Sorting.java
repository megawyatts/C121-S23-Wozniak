package WeekEleven;

public class Sorting {
    public void mergeSort(int[] array){
        if (array.length<=1){
            return;
        }
        int[] leftHalf= new int[array.length/2];
        int[] rightHalf=new int[array.length-leftHalf.length];

        for(int i=0;i<leftHalf.length;i++){
            leftHalf[i]=array[i];
        }
        for(int j=0;j<rightHalf.length;j++){
            rightHalf[j]=array[(leftHalf.length)+j];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(leftHalf,rightHalf,array);
    }
    private void merge(int[]leftSide,int[]rightSide,int[]array){
        int leftIndex=0;
        int rightIndex=0;
        int arrayIndex=0;

        while ((leftIndex<leftSide.length)&&(rightIndex<rightSide.length)){
            if (leftSide[leftIndex]<(rightSide[rightIndex])){
                array[arrayIndex]=leftSide[leftIndex];
                leftIndex++;
                arrayIndex++;
            } else{
                array[arrayIndex]=rightSide[rightIndex];
                rightIndex++;
                arrayIndex++;
            }
            }
        while (leftIndex < leftSide.length){
            array[arrayIndex]=leftSide[leftIndex];
            arrayIndex++;
            leftIndex++;
        }
        while(rightIndex<rightSide.length){
            array[arrayIndex]=rightSide[rightIndex];
            arrayIndex++;
            rightIndex++;
        }
        }

    }

