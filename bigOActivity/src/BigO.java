public class BigO {
    public void printOnce(String inputWords){
        System.out.println(inputWords);
    }
    public void printNTimes(int n){
        for (int i=1;i<=n;i++){
            System.out.printf("Here is %d potatoe\n",i);
        }
    }
    public void printNSquaredTimes(int n){
        for (int i=1;i<=n;i++){
            for(int p=1;p<=n;p++){
                System.out.print("Happy Birthday! ");
            }
        }
    }
}
