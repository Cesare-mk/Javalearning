package OSLab1;

import java.util.ArrayList;
import java.util.List;

public class RunQueue
{
    List<ProcessControlBlock> list = new ArrayList<>();
    public void Add(ProcessControlBlock p1)
    {
        this.list.add(p1);
    }
    public void Remove(ProcessControlBlock p2)
    {
        this.list.remove(p2);
    }
    public void Change()             //改变加入到运行队列中进程的信息
    {
        for(int i=0; i<list.size(); i++)
        {
            this.list.get(i).pri += 2;
            this.list.get(i).needTime -= this.list.get(i).round;
            this.list.get(i).status="run";
        }
    }

    public void Print(int count)
    {
        for (ProcessControlBlock i:list)
        {
            System.out.println(count + "                " + i.PID + "             " + i.pri
                    + "                " + i.needTime + "          " + i.status);


        }
    }

}
