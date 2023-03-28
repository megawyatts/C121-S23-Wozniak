package WeekTen;

public class Main {
    public static void main(String[] args){
        CatBuild harry= new CatBuild("American Shorthair","Harry",11);
        CatBuild chase=new CatBuild("Tabby mix","Chase",7);
        System.out.printf("Harry cat count: %d%n",harry.numberOfCats());
        System.out.printf("Chase cat count: %d%n",chase.numberOfCats());
        System.out.printf("Total cat Count:%d",CatBuild.numberOfCats());
    }
}
