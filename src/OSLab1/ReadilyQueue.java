package OSLab1;

import java.util.ArrayList;
import java.util.List;

public class ReadilyQueue
{
    List<ProcessControlBlock> list= new ArrayList<>();
    public void Add(ProcessControlBlock p1)
    {
      this.list.add(p1);
    }
    public void Remove(ProcessControlBlock p2)
    {
        this.list.remove(p2);
    }
    public void ChangePri()                 //改变进程优先数
    {
        for(int i=0; i< list.size(); i++)
        {
            this.list.get(i).pri += 2;
        }
    }
    public void Print(int count)         //打印进程信息
    {
        for (ProcessControlBlock i:list)
        {
            System.out.println(count + "                 " + i.PID + "             " + i.pri
                    + "                " + i.needTime + "          " + i.status);


        }
    }
}
