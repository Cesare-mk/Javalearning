package OSLab1;

import java.util.Comparator;

public class ProcessControlBlock
{
    String PID=null;         //进程ID（）
     int pri;              //进程优先数，初始由用户输入
     int round=4;        //时间片
     int needTime;       //进程到完成还需的时间（初始由用户输入，后续=needTIme-时间片）
    String status="readily";      //进程的状态“run" "readily" "finish"

    public ProcessControlBlock(String PID,int pri,int needTime)
    {
        this.PID = PID;
        this.pri = pri;
        this.needTime = needTime;
    }
}
class PCBCompare implements Comparator<ProcessControlBlock>
{

    @Override
    public int compare(ProcessControlBlock P1, ProcessControlBlock P2) {

        return P2.pri-P1.pri;
    }

}


