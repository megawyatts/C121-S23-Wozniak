package WeekSeven;

public class ArrayDemo {
    public static void main(String[] args){
        //int[] scores;
        //char[] letterGrades;
        //double[] gpas;
        //String[] names;

        //scores= new int[3];
        //letterGrades=new char[4];
        //gpas= new double[4];
        //names=new String[10];

        // or a way to do it all in one:
        int[] scores=new int[3];

        double[] gpas=new double[4];
        String[] names=new String[5];

        names[0]="Mary";
        names[1]="Tom";
        names[2]="John";
        names[3]="Jane";
        names[4]="Lisa";

        scores[0]=98;
        scores[1]=100;
        scores[2]=89;

        System.out.printf("There are %d names in the names array\n",names.length);
        System.out.printf("The name as index 0 is %s\n",names[0]);
        System.out.printf("The name as index 1 is %s\n",names[1]);
        System.out.printf("The name as index 2 is %s\n",names[2]);
        System.out.printf("The name as index 3 is %s\n",names[3]);
        System.out.printf("The name as index 4 is %s\n",names[4]);

        String[] letterGrades={"A","B","C","D","F"};

    }
}
