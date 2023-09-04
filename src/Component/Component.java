package Component;

public abstract class Component          //组件的父类
{
    String des="";

    public Component(String s)
    {
        this.des = s;
    }

    public String getDes()
    {
        return this.des;
    }

    public void setDes(String des)
    {
        this.des = des;
    }
    public abstract double computerPrice();
    public void addComponent(Component o)
    {
        throw new UnsupportedOperationException("不能添加子节点");
    }
}
