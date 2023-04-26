package Overloaded;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        int numberOfBooks;
        String title,author;
        int chapters,pubYear;

        System.out.println("How many books are you going to enter?");
        numberOfBooks=Integer.parseInt(keyboard.nextLine());

        for(int i=1;i<=numberOfBooks;i++){
            System.out.printf("\nWhat is the title of Book %d?\n",i);
            title=keyboard.nextLine();
            System.out.printf("Who is the author of %s?\n",title);
            author=keyboard.nextLine();
            System.out.printf("How many chapters are in %s?\n",title);
            chapters=Integer.parseInt(keyboard.nextLine());
            System.out.printf("What year was %s published in?\n",title);
            pubYear=Integer.parseInt(keyboard.nextLine());
            Book bookStats=new Book();
            Book bookTitle= new Book(title);
            Book newBook= new Book(title,author,chapters,pubYear);




        }

    }
}
