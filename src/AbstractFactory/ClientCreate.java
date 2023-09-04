package AbstractFactory;

public abstract class ClientCreate {          //客户端的创建类  抽象
    public Client createControls(String type)
    {
        Client client;
        client = create(type);
        return client;
    }
    public abstract Client create(String type);      //抽象的创建方法
}
class WindowsClientCreate extends ClientCreate{   //Windows 客户端的创建

    @Override
    public Client create(String type)
    {
        Client client1 = null;
        Controls controls = new WindowsControls();
        if(type.equals("Windows"))
        {
            client1 = new WindowsClient(controls);        //Windows客户端使用Windows控件
            client1.setName("WindowsClient");
        }
        return client1;
    }
}
class MotifClientCreate extends ClientCreate{     //Motif 客户端的创建

    @Override
    public Client create(String type)
    {
        Client client2 = null;
        Controls controls = new MotifControls();
        if(type.equals("Motif"))
        {
            client2 = new MotifClient(controls);        //Motif客户端使用Motif控件
            client2.setName("MotifClient");
        }
        return client2;
    }
}