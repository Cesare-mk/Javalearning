package observe;

public class VoiceScore implements Observer
{

    @Override
    public void update(String gameTime, int homeScore, int visitorScore)
    {
        System.out.println(String.format("%s:%d-%d voice",gameTime,homeScore,visitorScore));
    }
}
