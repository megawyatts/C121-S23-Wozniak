package WeekTen;

public class CatBuild {
    private String breed;
    private String name;
    private int age;
    private static int numbCats;

    public CatBuild(String breed,String name,int age){
        this.breed=breed;
        this.name=name;
        this.age=age;
        numbCats++;
    }

    public static int numberOfCats(){
        return numbCats;

    }
}
