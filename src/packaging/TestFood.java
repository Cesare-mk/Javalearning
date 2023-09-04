package packaging;

public class TestFood {
    public static void main(String[] args)
    {
        Food food = new Noddles(6.0);
        System.out.println(food.getDescription() + "  $" + food.getCost());

        Food food1 = new Noddles(6.0);
        food1 = new Beef(food1);
        food1 = new Egg(food1);
        food1 = new Tofu(food1);
        System.out.println(food1.getDescription() + "  $" + food1.getCost());


        Food food2 = new Vermicelli(6.0);
        System.out.println(food2.getDescription()+"  $"+food2.getCost());
        food2 = new Mutton(food2);
        food2 = new Beef(food2);
        System.out.println(food2.getDescription() + "  $" + food2.getCost());
        }
    }
