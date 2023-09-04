package decoration;
import java.io.IOException;
import  java.io.Reader;
import java.io.StringReader;
import java.io.FilterReader;

public class LowerCaseStringReader  extends FilterReader {
    Reader in;
    protected LowerCaseStringReader(Reader in)
    {
        super(in);
        this.in = in;
    }
    @Override
    public int read() throws IOException
    {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase( (char)c ));
    }

}
 class Main{

    public static void main(String[] args) throws IOException
    {
        LowerCaseStringReader r = new LowerCaseStringReader(new StringReader("Design Pattern"));

        int c;
        while( (c = r.read())>0)
        {
            System.out.print((char)c);
        }
    }
}
