package observe;

public class ScoreDB implements Observer
{
    @Override
    public void update(String gameTime, int homeScore, int visitorScore)
    {
        System.out.println(String.format("%s:%d-%d writeToDB",gameTime,homeScore,visitorScore));

    }
}
