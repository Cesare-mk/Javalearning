package com.mm.software;

import java.util.Date;

public class GeometricObject
{
    private String color = "white";
    private boolean filled;
    private Date dataCreated;

    protected GeometricObject()
    {
        dataCreated=new Date();
        filled=false;
    }
    protected GeometricObject(String color,boolean filled)
    {
        dataCreated=new Date();
        this.color=color;
        this.filled=filled;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    public Date getDataCreated()
    {
        return dataCreated;
    }
    @Override
    public String toString()
    {
        return "PS: " + "create on " + dataCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}
class Circle extends GeometricObject
{
    private double radius;
    public Circle()
    {
        radius=0;
    }
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
}

