package Component;

import java.util.ArrayList;

public class Composite extends Component
{
    ArrayList<Component> list;
    public Composite(String s)    //数据域的名称
    {
        super(s);
        this.list = new ArrayList<Component>();
    }

    public String getName()
    {
        return super.getDes();
    }

    public void setName(String name)
    {
        super.setDes(name);
    }

    @Override
    public void addComponent(Component o)
    {
        this.list.add(o);
    }

    @Override
    public double computerPrice()
    {
        double sumPrice = 0;
        for (int i = 0; i < this.list.size(); i++)
        {
            sumPrice += this.list.get(i).computerPrice();
        }
        return sumPrice;
    }
}
