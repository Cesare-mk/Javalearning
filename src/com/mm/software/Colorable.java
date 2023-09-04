package com.mm.software;

public interface Colorable
{
    public abstract void howtoColor();//接口里的抽象方法 可见性修饰符和abstract 可省略

}
class Square extends GeometricObject implements Colorable
{
    private double side;
    public Square()
    {
        this.side=0;
    }
    public Square(String color,boolean filled,double side)
    {
        super(color,filled);
        this.side=side;
    }
    public double getSide()
    {
        return side;
    }
    public void setSide(double side)
    {
        this.side=side;
    }
    @Override
    public void howtoColor()
    {
        System.out.println("Color all four sides");
    }
    @Override
    public String toString()
    {
        if(super.isFilled())
            howtoColor();
        return super.toString() + " and sides: " + getSide();
    }
}
