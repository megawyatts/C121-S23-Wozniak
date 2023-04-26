package inheritance;

public class NonFictionPodcast extends Podcast{
    private String podHost, podTopic;
    private void setPodHost(String host){
        podHost=host;
    }
    private String getPodHost(){
        return podHost;
    }
    private void setPodTopic(String topic){
        podTopic=topic;
    }
    private String getPodTopic(){
        return podTopic;
    }
    @Override
    public String toString(){
        return String.format("Podcast %s \t Genre: %s \t Host: %s\n" +
                "Podcast Topic: %s \t Year Published: %d",podTitle,podGenre,getPodHost(),getPodTopic(),getPodYearPub());
    }
}
