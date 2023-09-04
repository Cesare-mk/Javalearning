package celue;

public class ShortWheelCar extends Car
{
    BrakeBehavior brakeBehavior;
    public ShortWheelCar(BrakeBehavior b)
    {
        this.brakeBehavior = b;
    }
    @Override
    public void brake()
    {
       this.brakeBehavior.stop();
    }
}
