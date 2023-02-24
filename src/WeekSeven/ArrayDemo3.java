package WeekSeven;

public class ArrayDemo3 {
    public static void main(String[] args){
        String[][] array1={{"Ensemble Stars!!","Happy Elements","Mika Kagehira"},
                {"Project Sekai: Colorful Stage","Colorful Palette","An Shiraishi"},{"Bandori: Dream Girls!","Bushiroad","Nanami"},
                {"Revue Starlight","Bushiroad","Karen"}};
        for ( String[] row : array1){
            for (String column: row){
                System.out.printf("%s ",column);
            }
            System.out.println("\n");
        }

    }
}
