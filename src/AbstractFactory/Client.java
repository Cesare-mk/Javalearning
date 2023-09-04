package AbstractFactory;

public abstract class Client {    //客户端的基类  抽象 ，
    String name;
    public void setName(String name)
    {
        this.name = name;
    }
   public abstract void  ControlStyle();  //使用的控件类型
}

class WindowsClient extends Client{     //Windows 的客户端
    Controls controls;
    public WindowsClient(Controls controls1)   //使用Windows 控件
    {
        this.controls = controls1;
    }
    @Override
    public void ControlStyle()
    {
        System.out.println("WindowsControls: "+ controls.createButton()+controls.createTextBox()+controls.createLabel());
    }

}
class MotifClient extends Client{      //Motif 的客户端
    Controls controls;
    public MotifClient(Controls controls1)       //使用Motif 控件
    {
        this.controls = controls1;
    }
    @Override
    public void ControlStyle()
    {
        System.out.println("MotifControls: "+controls.createButton()+controls.createTextBox()+controls.createLabel());
    }

}
class LinuxClient extends Client{       //Linux 的客户端
    Controls controls;
    public LinuxClient(Controls controls1)               //使用Linux 控件
    {
        this.controls = controls1;
    }
    @Override
    public void ControlStyle()
    {
        System.out.println("LinuxControls: "+controls.createButton()+controls.createTextBox()+controls.createLabel());
    }

}