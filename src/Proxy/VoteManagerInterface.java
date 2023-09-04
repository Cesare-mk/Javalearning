package Proxy;

public interface VoteManagerInterface
{
    void addStudent(Students s);

    void vote(Students voter,Students select);

    int getVoteNum(Students s);
}
