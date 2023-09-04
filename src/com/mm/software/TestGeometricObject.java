package com.mm.software;


public class TestGeometricObject
{
    public static void main(String[] args)
    {
        GeometricObject[] arr=new GeometricObject[5];
        arr[0]=new Square("yellow",true,3 );
        arr[1]=new Square("blue",true,4);
        arr[2]=new Circle(5);
        arr[3]=new GeometricObject("black",true);
        arr[4]=new Square("gold",true,5);
        for(GeometricObject i:arr)
        {
           if(i instanceof Square)
           {
               System.out.println();
               System.out.println(((Square)i).toString());

           }
        }
    }
}
