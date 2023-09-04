package AbstractFactory;

public interface Controls {         //创建控件的基类，实现为接口
    public String createButton();

    public String createTextBox();

    public String createLabel();

}
class WindowsControls implements Controls{    //Windows的控件，包含按钮，文本框，标签等

    @Override
    public String createButton()
    {
        return " WindowsButton";
    }

    @Override
    public String createTextBox()
    {
        return " WindowsTextBox";
    }

    @Override
    public String createLabel()
    {
        return " WindowsLabel";
    }
}
class MotifControls implements Controls{  //Motif的控件，包含按钮，文本框，标签等

    @Override
    public String createButton()
    {
        return " MotifButton";
    }

    @Override
    public String createTextBox()
    {
        return " MotifTextBox";
    }

    @Override
    public String createLabel()
    {
        return " MotifLabel";
    }
}
class LinuxControls implements Controls{    //Linux的控件，包含按钮，文本框，标签等

    @Override
    public String createButton()
    {
        return " LinuxButton";
    }

    @Override
    public String createTextBox()
    {
        return " LinuxTextBox";
    }

    @Override
    public String createLabel()
    {
        return " LinuxLabel";
    }
}