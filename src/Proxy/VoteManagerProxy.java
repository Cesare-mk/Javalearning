package Proxy;

public class VoteManagerProxy implements VoteManagerInterface
{
   private VoteManager voteManager;
   private Students s1;
   private Students s2;
    public VoteManagerProxy(VoteManager v)
    {
        this.voteManager = v;
    }

    @Override
    public void addStudent(Students s)
    {
        voteManager.addStudent(s);
    }

    @Override
    public void vote(Students voter, Students select)
    {
        if(voter != select)          //防止自己投自己
        {
            if(s1 != voter || s2 != select)         // 防止重复投票
            {
                this.SetAttribute(voter,select);
                voteManager.vote(voter,select);
            }
        }
    }

    @Override
    public int getVoteNum(Students s)
    {
        return voteManager.getVoteNum(s);
    }

    public void SetAttribute(Students a,Students b)
    {
        this.s1 = a;
        this.s2 = b;
    }

}
