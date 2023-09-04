package packaging;
public abstract class Food
{                   //基类，食物类
    String description = "The original";

    public String getDescription()
    {
        return description;
    }
    public abstract double getCost();

}

 abstract class Accessories extends Food
 {                 //装饰器类
    public abstract String getDescription();
 }

