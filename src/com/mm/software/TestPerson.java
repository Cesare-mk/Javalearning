package com.mm.software;

import java.util.ArrayList;
import java.util.List;

public class TestPerson
{
    public static void main(String[] args)//克隆方法的实现以及排序
    {

        List<Person1> arrayLists=new ArrayList<>();     //创建一个含 Person1 类的list；
        arrayLists.add (new Person1("张杉",178.5,55.3));
        arrayLists.add (new Person1("李思",168.4,52.3));
        arrayLists.add (new Person1("赵乐",180.8,60.5));
        arrayLists.add (new Person1("王超",178.5,56.5));
        arrayLists.add (new Person1("宋仙",160.5,53.5));

        java.util.Collections.sort(arrayLists);                  //对 list 排序

        Person1 p1 = new Person1("药明",190.3,60.5);
        Person1 p2 = (Person1) p1.clone();           //使用克隆方法

        System.out.println("下面是person1 对象的排序：");
        for (Person1 p:arrayLists)
        {
            System.out.println(p.toString());
        }


        System.out.println();
        System.out.println("下面是一个克隆的实现：");
        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
    }
}

class Person1 implements Cloneable,Comparable<Person1>
{
    private String name;
    private double high;
    private double weight;
    public Person1(String name,double high,double weight)
    {
        this.name=name;
        this.high=high;
        this.weight=weight;
    }
    public double getHigh()
    {
        return this.high;
    }
    public void setHigh(double high1)
    {
        this.high=high1;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public void setWeight(double weight1)
    {
        this.weight=weight1;
    }
    @Override
    public String toString()             //重写 toString 方法
    {
        return "Name: " + this.name + "  high: " + this.high + "  weight: " + this.weight;
    }
    @Override
    public int compareTo(Person1 b)              //重写并实现compareTo方法
    {
        if (high > b.getHigh())
            return 1;
        else if (high == b.getHigh() && weight > b.getWeight())
            return 1;
        else if (high == b.getHigh() && weight == b.getWeight())
            return 0;
        else
            return -1;
    }
    @Override
    public Object clone()             //重写 clone 方法
    {
        try
        {
            return super.clone();
        }
        catch (CloneNotSupportedException ex)
        {
            return null;
        }
    }
}