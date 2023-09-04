package factory;

public class Motiffactory implements AbstractFactory
{
    Button  motifButton;
    TextBox motifTextBox;
    @Override
    public Button createButton()
    {
        this.motifButton = new MotifButton();
        return this.motifButton;
    }

    @Override
    public TextBox createTextBox()
    {
        this.motifTextBox = new MotifTextBox();
        return this.motifTextBox;
    }
}
