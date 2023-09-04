package AbstractFactory;

public class Test {
    public static void main(String[] args) {
        ClientCreate c1 = new WindowsClientCreate();
        Client c = c1.createControls("Windows");
        System.out.print( "客户端："+c.name +"  使用：");
        c.ControlStyle();
        System.out.println();

        ClientCreate c2 = new MotifClientCreate();
        Client cc = c2.createControls("Motif");
        System.out.print( "客户端："+cc.name +"  使用：");
        cc.ControlStyle();
    }
}
