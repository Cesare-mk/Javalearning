package Proxy;

public class Main
{
    public static void main(String[] args){

        Students s1=new Students("001","张三");

        Students s2=new Students("002","李四");

        Students s3=new Students("003","王五");

        VoteManagerInterface v=new VoteManagerProxy(new VoteManager());

        v.addStudent(s1);

        v.addStudent(s2);

        v.addStudent(s3);


        v.vote(s1,s1);

        v.vote(s1,s2);

        v.vote(s1,s2);

        v.vote(s1,s3);

        v.vote(s2,s1);

        v.vote(s3,s2);

        v.vote(s3,s1);

        v.vote(s3,s3);


        System.out.println(v.getVoteNum(s1));

        System.out.println(v.getVoteNum(s2));

        System.out.println(v.getVoteNum(s3));

    }

}
