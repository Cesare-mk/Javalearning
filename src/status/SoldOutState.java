package status;

public class SoldOutState extends State
{
    TissueMachine tissueMachine;
    public SoldOutState(TissueMachine tissueMachine)
    {
        this.tissueMachine = tissueMachine;
    }
    @Override
    public void insertQuarter()//投币
    {
       System.out.println("You can't insert a quarter, the machine is sold out");
    }
    @Override
    public void ejectQuarter()//退币
    {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }
    @Override
    public void turnCrank() //按下“出纸巾”按钮
    {
        System.out.println("You turned, but there are no gumballs");
    }
    @Override
    public void dispense() //出纸巾
    {
        System.out.println("No gumball dispensed");
    }
    @Override
    public void printState()
    {
        System.out.println("SoldOutState");
    }
}


class SoldState extends State
{
    TissueMachine tissueMachine;
    public SoldState(TissueMachine tissueMachine)
    {
        this.tissueMachine = tissueMachine;
    }
    @Override
    public void insertQuarter()//投币
    {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter()//退币
    {
        System.out.println("Sorry, you already turned the crank");
    }
    @Override
    public void turnCrank() //按下“出纸巾”按钮
    {
        System.out.println("Turning twice doesn't get you another gumball!");
    }
    @Override
    public void dispense() //出纸巾
    {
        if(tissueMachine.getCount()>0)
        {
            tissueMachine.setState(tissueMachine.getNoQuarterState());
        }
        else
            tissueMachine.setState(tissueMachine.getSoldOutState());
    }
    @Override
    public void printState()
    {
        System.out.println("SoldState");
    }
}

class NoQuarterState extends State
{
    TissueMachine tissueMachine;
    public NoQuarterState(TissueMachine tissueMachine)
    {
        this.tissueMachine = tissueMachine;
    }
    @Override
    public void insertQuarter()//投币
    {
        tissueMachine.setState(tissueMachine.getHasQuarterState());
    }
    @Override
    public void ejectQuarter()//退币
    {
        System.out.println("You haven't inserted a quarter");
    }
    @Override
    public void turnCrank() //按下“出纸巾”按钮
    {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() //出纸巾
    {
        System.out.println("You need to pay first");
    }
    @Override
    public void printState()
    {
        System.out.println("NoQuarterState");
    }
}

class HasQuarterState extends State
{
    TissueMachine tissueMachine;
    public HasQuarterState(TissueMachine tissueMachine)
    {
        this.tissueMachine = tissueMachine;
    }
    @Override
    public void insertQuarter()//投币
    {
        System.out.println("You can't insert another quarter");
    }
    @Override
    public void ejectQuarter()//退币
    {
        tissueMachine.setState(tissueMachine.getNoQuarterState());
    }
    @Override
    public void turnCrank() //按下“出纸巾”按钮
    {
        tissueMachine.setState(tissueMachine.getSoldState());
    }
    @Override
    public void dispense() //出纸巾
    {
        System.out.println("No gumball dispensed");
    }
    @Override
    public void printState()
    {
        System.out.println("HasQuarterState");
    }
}