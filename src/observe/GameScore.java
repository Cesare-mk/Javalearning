package observe;

import java.util.ArrayList;

public class GameScore implements Subject
{
    private String gameTime;//比赛进行时间

    private int homeScore;//主队得分

    private int visitorScore;//客队得分

    private ArrayList<Observer> observers;//观察者列表


    public GameScore()
    {
        this.observers = new ArrayList<>();
    }

    public void setScore(String gameTime,int homeScore,int visitorScore)
    {

        this.gameTime=gameTime;

        this.homeScore=homeScore;

        this.visitorScore=visitorScore;

        notifyObserver();

    }

    @Override
    public void registerObserver(Observer o)
    {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o)  //判断该观察者是否已经注册，注册后才能注销
    {
        int i = this.observers.indexOf(o);
        if (i >= 0)
        {
            this.observers.remove(i);
        }
    }

    @Override
    public void notifyObserver()           //循坏遍历观察者list
    {
        for (int i = 0; i < this.observers.size(); i++)
        {
            Observer observer = this.observers.get(i);
            observer.update(this.gameTime,this.homeScore,this.visitorScore);
        }
    }
}
