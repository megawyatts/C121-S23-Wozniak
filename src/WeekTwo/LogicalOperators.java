package WeekTwo;

public class LogicalOperators {
    public static void main(String[]args){
        boolean isStudent=true;
        boolean isCSMajor=true;
        boolean isProfessor=false;
        boolean isTA=false;

        System.out.println("Both Expressions aretrue");
        System.out.printf(" isStudent (true) and isCSMajor(true)=%b\n", isStudent && isCSMajor);
        System.out.printf(" isStudent(true) or isCSMajor(true)= %b\n\n",isStudent||isCSMajor);

        System.out.printf("isStudent(true) or isProfessor(false) = %b\n", isStudent && isProfessor);
        System.out.printf(" isStudent(true) or isProfessor(false)=%b\n\n", isStudent || isProfessor);

        System.out.println("Both expressions are false:");
        System.out.printf(" isProfessor (false) and isTA(false)=%b\n",isProfessor && isTA);
        System.out.printf(" isProfessor(false) or isTA(false)=%b\n\n",isProfessor && isTA);
    }
}
