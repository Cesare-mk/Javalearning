package OSLab1;

import java.util.Collections;
import java.util.Scanner;

public class Process extends Thread {
    private int num;                                                                        //要运行的进程个数
    private RunQueue runQueue = new RunQueue();                                                   //运行队列
    private ReadilyQueue readilyQueue = new ReadilyQueue();                                      //就绪队列
    private FinishQueue finishQueue = new FinishQueue();                                         //完成队列
    private int count=0;                                                                      //记录时间片

    public void Initialize()
    {
        System.out.println("******************************************");
        System.out.println("*************   优先级轮转调度   ************");

        System.out.println("请输入进程个数(不少于1个进程)：");                          //初始化要进行运行的进程
        Scanner input = new Scanner(System.in);
        Scanner inputPID = new Scanner(System.in);
        Scanner inputPri = new Scanner(System.in);
        Scanner inputNeedTime = new Scanner(System.in);
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("请输入第" + i + "个进程号");
            String PID = inputPID.next();
            System.out.println("请输入第" + i + "个进程的优先级");
            int pri = inputPri.nextInt();
            System.out.println("请输入第" + i + "个进程所需的运行时间");
            int needTime = inputNeedTime.nextInt();
            readilyQueue.list.add(new ProcessControlBlock(PID, pri,needTime));
            System.out.println();
        }
    }

    public void Run()
    {
        boolean judge = true;
            Collections.sort(readilyQueue.list, new PCBCompare());              //对顺序表根据优先级进行排序
            count++;                                                          //第一个时间片开始
            while (judge)
            {
                if (runQueue.list.size()==0)
                {                                                               //如果运行队列为空
                    runQueue.Add(readilyQueue.list.get(0));                //将就绪队列里面优先级最高的进程加入运行队列
                    readilyQueue.Remove(readilyQueue.list.get(0));

                }
                runQueue.Change();                          //改变加入运行队列的进程相关信息
                readilyQueue.ChangePri();                  //改变就绪队列的进程优先级
                this.ReadilyMoveToFinish();
                System.out.println("经过了" + (count) + "个时间片后，" + runQueue.list.get(0).PID + "被调用." + "还需" + runQueue.list.get(0).needTime + "时间");
                System.out.println("经过时间片数" + "      " + "进程名字" + "     " + "该进程优先级" + "    " + "仍所需运行时间" + "     调度状态");
                System.out.println("----------------------------------------------------------------------------");
                runQueue.Print(count);
                System.out.println("-----------------------------------------------------------------------------");
                readilyQueue.Print(count);                        //打印就绪队列中的进程
                System.out.println("------------------------------------------------------------------------------");
                finishQueue.Print(count);                        //打印已经完成的进程
                this.RunToFinish();
                Collections.sort(readilyQueue.list, new PCBCompare());
                count++;
                if (finishQueue.list.size() == num)                     //如果完成队列中放的进程等于一开始的进程数，说明进程全部执行完毕
                {
                    judge = false;
                    System.out.println("进程全部执行完毕！");
                    finishQueue.Print(count);

                }
                try {
                    sleep(1000);                                                    //间隔1000毫秒
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
    }
    public void ReadilyMoveToFinish()
    {
        for (int i = 0; i < readilyQueue.list.size(); i++)                //每个进程循环进行判断，如果运行时间为0后更改运行状态为finish
        {
            if (readilyQueue.list.get(i).needTime == 0)
            {
                readilyQueue.list.get(i).status = "finish";
                finishQueue.Add(readilyQueue.list.get(i));
                readilyQueue.Remove(readilyQueue.list.get(i));
            }
        }
    }
    public void RunToFinish()
    {
        for (int i = 0; i < runQueue.list.size(); i++)                //每个进程循环进行判断，如果运行时间为0后更改运行状态为finish
        {                                                                //加入完成队列
            if(runQueue.list.get(i).needTime == 0)
            {
                runQueue.list.get(i).status = "finish";
                finishQueue.Add(runQueue.list.get(i));
            }
            else                                                           //如果剩余运行时间不为零，移到就绪队列
            {
                runQueue.list.get(i).status = "readily";
                readilyQueue.Add(runQueue.list.get(i));
            }
            runQueue.Remove(runQueue.list.get(i));
        }
    }

}
