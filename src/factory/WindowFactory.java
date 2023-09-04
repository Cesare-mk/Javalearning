package factory;

public class WindowFactory implements AbstractFactory
{
    Button windowsButton;
    TextBox textBox;
    @Override
    public Button createButton()
    {
        this.windowsButton = new WindowsButton();
        return this.windowsButton;
    }

    @Override
    public TextBox createTextBox()
    {
        this.textBox = new WindowsTextBox();
        return this.textBox;
    }
}
