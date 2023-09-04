package com.mm.software;

import javax.xml.crypto.Data;

public class Test112
{
    public static void main(String[] args)
    {
        Person p = new Person("马超","贵州","12345","123ab@qq.com");
        Student s = new Student("ONE","赵子龙","贵州","12345","123cd@qq.com");
        Employee e = new Employee("办公室",3000.00,"黄盖","上海","123123","253@qq.com");
        Faculty f = new Faculty("officeTime","等级","办公室",4000.00,"周瑜","上海","123456","452@qq.com");
        Staff st = new Staff("办公室",2000.00,"头衔","曹操","北京","45623","4562@qq.com");
        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(st.toString());

    }
}
class Person                  //Person类
{
    private String name ;
    private String address ;
    private String telephoneNumber ;
    private String emailAddress ;
    public Person()
    {

    }
    public Person(String name,String address,String telephoneNumber, String emailAddress)     //含参数构造方法
    {
        this.name=name;
        this.address=address;
        this.telephoneNumber=telephoneNumber;
        this.emailAddress=emailAddress;
    }
    public String getName()     //数据域的访问器
    {
        return this.name;
    }

    public void setName(String name)            //修改器
    {
        this.name=name;
    }

    public String getAddress()                        //数据域的访问器
    {
        return this.address;
    }

    public void setAddress(String address)          //修改器
    {
        this.address=address;
    }

    public String getTelephoneNumber()                    //数据域的访问器
    {
        return this.telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber)          //修改器
    {
        this.telephoneNumber=telephoneNumber;
    }

    public String getEmailAddress()                       //数据域的访问器
    {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress)             //修改器
    {
        this.emailAddress=emailAddress;
    }

    @Override               //toString方法重写
    public String toString()
    {
        return "Person类 " + "Name: " +getName();
    }
}

class Student extends Person                       //Student类
{
    private final static String ONE="Freshman";      //定义四个常量
    private final static String TWO="Sophomore";
    private final static String THREE="Junior";
    private final static String FOUR="Senior";
    private String StudentClass;
    public Student()
    {
        this.StudentClass=ONE;
    }

    public Student(String studentClass,String name,String address,String telephoneNumber, String emailAddress)
    {
        super(name,address,telephoneNumber,emailAddress);          //调用父类 Person的含参构造方法
        this.StudentClass=studentClass;
    }

    public String getStudentClass()              //访问器
    {
        return this.StudentClass;
    }

    public void setStudentClass(String studentClass)       //修改器
    {
        this.StudentClass=studentClass;
    }

    @Override                     //toString 方法重写
    public String toString()
    {
        return "Student类 " + "Name: " + getName();
    }

}

class Employee extends Person                   //
{
    private String office;
    private double salary;

    public Employee() {

    }

    public Employee(String office, double salary, String name, String address, String telephoneNumber, String emailAddress)
    {
        super(name, address, telephoneNumber, emailAddress);              //
        this.office = office;
        this.salary = salary;
    }

    public String getOffice()                      //访问器
    {
        return this.office;
    }

    public void setOffice(String office)              //修改器
    {
        this.office = office;
    }

    public double getSalary()                       //访问器
    {
        return this.salary;
    }

    public void setSalary(double salary)               //修改器
    {
        this.salary = salary;
    }
    @Override                     //toString方法重写
    public String toString()
    {
        return "Employee类 " + "Name：" + getName();
    }
}

class Faculty extends Employee          //Faculty类
{
    private String officeTime;
    private String grade;
    public Faculty()
    {

    }
    public Faculty(String officeTime,String grade,
                   String office,double salary,String name, String address,String telephoneNumber, String emailAddress)
    {
        super(office,salary,name, address, telephoneNumber, emailAddress);
        this.officeTime=officeTime;
        this.grade=grade;
    }

    public String getOfficeTime()          //访问器
    {
        return officeTime;
    }

    public void setOfficeTime(String officeTime)          //修改器
    {
        this.officeTime=officeTime;
    }

    public String getGrade()                //访问器
    {
        return this.grade;
    }

    public void setGrade(String grade)                  //修改器
    {
        this.grade=grade;
    }
    @Override
    public String toString()              //重写 toString 方法
    {
        return "Faculty类 " + "Name: " + getName();
    }

}

class Staff extends Employee
{
    private String position;
    public Staff()
    {

    }
    public Staff(String office,double salary,String position,String name, String address,String telephoneNumber, String emailAddress)
    {
        super(office,salary, name,address,telephoneNumber,emailAddress);
        this.position=position;
    }
    public String getPosition()          //访问器
    {
        return this.position;
    }
    public void setPosition(String position)           //修改器
    {
        this.position=position;
    }
    @Override                        //重写toString方法
    public String toString()
    {
        return "Staff类 " + "Name:  " + getName();
    }
}