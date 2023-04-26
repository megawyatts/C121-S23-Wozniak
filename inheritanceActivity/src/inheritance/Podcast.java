package inheritance;

public class Podcast {
    public String podTitle, podGenre;
    private String producer;
    private int podYearPub;

    public void setTitle(String title){
        podTitle=title;
    }
    private String getProducer(){
        return producer;
    }
    public int getPodYearPub(){
        return podYearPub;
    }
    public void setPodGenre(String genre){
        podGenre=genre;
    }
    public void setProducer(String producer){
        this.producer=producer;
    }
    public void setPodYearPub(int podYearPub){
        this.podYearPub=podYearPub;
    }
    public String toString(){
        return (String.format("Podcast: %s \t Genre: %s \nProducer:%s \t Year Published: %d",podTitle, podGenre, getProducer(),getPodYearPub()));

    }
}
