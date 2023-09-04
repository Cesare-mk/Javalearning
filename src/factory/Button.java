package factory;

abstract class Button {}
abstract class TextBox{}



class WindowsButton extends Button
{

    public WindowsButton()
    {
        System.out.println("createWindowsButton");
    }

}

class MotifButton extends Button
{

    public MotifButton()
    {
        System.out.println("createMotifButton");
    }

}


class WindowsTextBox extends TextBox
{

    public WindowsTextBox()
    {
        System.out.println("createWindowTextBox");

    }

}


class MotifTextBox extends TextBox
{

    public MotifTextBox()
    {
        System.out.println("createMotifTextBox");

    }

}

