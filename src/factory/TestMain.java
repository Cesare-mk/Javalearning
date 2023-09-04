package factory;

public class TestMain
{
    public static void main(String[] args)
    {

        Dialog dialog=new Dialog();

        dialog.setFactory(new WindowFactory());

        dialog.init();

        dialog.setFactory(new Motiffactory());

        dialog.init();

    }
}
