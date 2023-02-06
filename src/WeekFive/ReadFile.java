package WeekFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File courses= new File("courses.txt");

        try {
            Scanner input = new Scanner(courses);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

}
