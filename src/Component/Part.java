package Component;

public class Part extends Component
{
    private double price;
    public Part(double price,String name)
    {
        super(name);
        this.price = price;
    }

    public String getName()
    {
        return super.getDes();
    }

    public void setName(String name)
    {
        super.setDes(name);
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public double computerPrice()                         //实现父类的计算价格方法
    {
        return this.price;
    }

}
