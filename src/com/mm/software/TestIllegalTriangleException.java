package com.mm.software;

public class TestIllegalTriangleException
{
    public static void main(String[] args)//异常测试
    {
        try
        {
            Triangle t1 = new Triangle(3,4,5);
            Triangle t2 = new Triangle(4,4,9);
        }
        catch (IllegleTriangleException ex)
        {
            System.out.println("The Triangle's sides were wrong!");
            System.out.println(ex);
        }
    }
}
class IllegleTriangleException extends Exception
{
    public IllegleTriangleException(double side1,double side2,double side3)
    {
        super("Wrong sides: "+ side1 + " " + side2 +" " + side3);
    }
}
class Triangle
{
    private double side1;
    private double side2;
    private double side3;
    public Triangle()
    {
        side1=1.0;
        side2=1.0;
        side3=1.0;
    }
    public Triangle(double side1,double side2,double side3) throws IllegleTriangleException
    {
        if (side1 < (side2 + side3) && side2 < (side1+side3)  && side3 < (side1 + side2))
        {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        else
        {
            throw new IllegleTriangleException(side1,side2,side3);
        }
    }
    public double getSide1()
    {
        return this.side1;
    }
    public double getSide2()
    {
        return this.side2;
    }
    public double getSide3()
    {
        return this.side3;
    }
    public double getArea()
    {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }
    @Override
    public String toString()
    {
        return "Triangle: side1 = " + this.side1 + "side2 = " + this.side2 + "side3 = " + this.side3;
    }
}
