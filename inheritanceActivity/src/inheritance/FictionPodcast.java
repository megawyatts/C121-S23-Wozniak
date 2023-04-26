package inheritance;

public class FictionPodcast extends Podcast{
    private String  podAuthor, podProtagonist;
    private void setPodAuthor(String author){
        podAuthor=author;
    }
    private String getPodAuthor(){
        return podAuthor;
    }
    private void setPodProtagonist(String protag){
        podProtagonist=protag;
    }
    private String getPodProtagonist(){
        return podProtagonist;
    }
    @Override
    public String toString(){
        return String.format("Podcast: %s \tGenre: %s \t Author: %s\n" +
                "Protagonist: %s \t Year Published: %d",podTitle,podGenre,getPodAuthor(),getPodProtagonist(),getPodYearPub());
    }
}

