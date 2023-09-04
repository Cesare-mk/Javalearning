package celue;

public class LongWheelCar extends Car
{
    BrakeBehavior brakeBehavior;
    public LongWheelCar(BrakeBehavior b)
    {
        this.brakeBehavior = b;
    }

    @Override
    public void brake()
    {
       this.brakeBehavior.stop();
    }
}
