package com.mm.software;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Circletest {
    public static void main(String[] args) {
        Calendar c= new GregorianCalendar();
        System.out.println(new Date());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));

    }
}
 interface in{
   public abstract void car();
}
abstract class at implements in{

}