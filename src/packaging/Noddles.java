package packaging;


public class Noddles extends Food
{
    //面条类，继承自Food类，实现价格方法

    Double price;
    public Noddles(Double price)
    {
        super.description = "素面条";
        this.price = price;
    }

    @Override
    public double getCost()
    {
        return this.price;
    }
}

class Vermicelli extends Food
{           // //米粉类，继承自Food类，实现价格方法
    Double price;
    public Vermicelli(Double price)
    {
        super.description = "素米粉";
        this.price = price;
    }

    @Override
    public double getCost()
    {
        return this.price;
    }
}
