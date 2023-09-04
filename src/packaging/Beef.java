package packaging;

public class Beef extends Accessories {   //佐料 牛肉类 装饰面条或者米粉
    Food food;
    public Beef (Food food)
    {
        this.food = food;
    }

    @Override
    public double getCost()
    {           //牛肉片的价格加被包装的食物的价格
        return 4.00 + food.getCost();
    }

    @Override
    public String getDescription()
    {
        return "牛肉 + " + food.getDescription();        //装饰过后的描述
    }
}


class Mutton extends Accessories {   //佐料 羊肉类 装饰面条或者米粉
    Food food;
    public Mutton (Food food)
    {
        this.food = food;
    }

    @Override
    public double getCost()
    {           //羊肉片的价格加被包装的类的价格
        return 4.00 + food.getCost();
    }

    @Override
    public String getDescription()
    {
        return "羊肉 + " + food.getDescription();           //装饰过后的描述
    }
}



class Egg extends Accessories
{                                    //佐料 鸡蛋类 装饰面条或者米粉
    Food food;
    public Egg (Food food)
    {
        this.food = food;
    }

    @Override
    public double getCost()
    {                               //鸡蛋的价格加被包装的类的价格
        return 2.00 + food.getCost();
    }

    @Override
    public String getDescription()
    {
        return "鸡蛋 + " + food.getDescription();             //装饰过后的描述
    }
}


 class Tofu extends Accessories {   //佐料 豆腐干类 装饰面条或者米粉
    Food food;
    public Tofu (Food food)
    {
        this.food = food;
    }

    @Override
    public double getCost()
    {              //豆腐干的价格以及被包装的类价格
        return 1.50 + food.getCost();
    }

    @Override
    public String getDescription()
    {
        return "豆腐干 + " + food.getDescription();           //装饰过后的描述
    }
}


