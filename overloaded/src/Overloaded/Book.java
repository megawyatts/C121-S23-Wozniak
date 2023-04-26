package Overloaded;

public class Book {
    private String title;
    private String author;
    private int chapters;
    private int pubYear;

    //constructor
    public Book(){
        this.title=title;
        this.author=author;
        this.chapters=chapters;
        this.pubYear=pubYear;
    }
    public Book(String title,String author,int chapters,int pubYear){
        this.title=getTitle();
        this.author=getAuthor();
        this.chapters=getChaps();
        this.pubYear=getPubYear();
        int age=setAge(pubYear);
        System.out.printf("Your book is %s by %s,\nIt has %d chapters and was published in %s.\n",title,author,chapters,pubYear);
        System.out.printf("%s is %d years old!\n",title,age);
    }
    public Book(String title){
        this.title=title.toUpperCase();
        System.out.println(title);
    }
    public String getTitle(){
        return title;
    }
    public int setAge(int pubYear){
        int age;
        age=2023-pubYear;
        return age;
    }
    public String getAuthor(){
        return author;
    }
    public int getChaps(){
        return chapters;
    }
    public int getPubYear(){
        return pubYear;
    }
}
