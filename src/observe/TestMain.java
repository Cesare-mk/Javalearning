package observe;

public class TestMain
{
    public static void main(String[] args){

        GameScore gameScore=new GameScore();

        ScoreDB scoreDB=new ScoreDB();

        VoiceScore voiceScore=new VoiceScore();

        DisplayScore displayScore=new DisplayScore();

        gameScore.registerObserver(scoreDB);

        gameScore.registerObserver(voiceScore);

        gameScore.registerObserver(displayScore);

        gameScore.setScore("Game15minute",115,110);

        gameScore.removeObserver(voiceScore);
        System.out.println();

        gameScore.setScore("Game25minute",125,133);

    }
}
