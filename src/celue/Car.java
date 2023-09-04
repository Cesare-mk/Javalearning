package celue;

public abstract class Car
{
   // BrakeBehavior brakeBehavior;   //轮胎行为，需要何种在创建的时候注入

    public Car()
    {

    }
    public abstract void brake();    //具体的行为交给子类实现
}
