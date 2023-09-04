package Proxy;

import java.util.HashMap;

public class VoteManager implements VoteManagerInterface
{
    private HashMap<String,Integer> map=new HashMap<>();

    @Override
    public void addStudent(Students s)
    {
        map.put(s.getSno(),0);
    }

    @Override
    public void vote(Students voter, Students select)
    {
        if(map.containsKey(select.getSno()))
        {
            Integer v=map.get(select.getSno());         //返回key值对应的value
            map.put(select.getSno(),v+1);
        }
        else
        {
            map.put(select.getSno(),0);
        }
    }

    @Override
    public int getVoteNum(Students s)
    {
        if(map.containsKey(s.getSno()))
        {
            return map.get(s.getSno());
        }
        return 0;
    }
}
