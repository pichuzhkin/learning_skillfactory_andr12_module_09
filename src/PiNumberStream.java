import java.io.IOException;
import java.io.InputStream;
import java.lang.Math;
public class PiNumberStream extends InputStream {

    private int position = 0;
    private final String piInString = Double.toString(Math.PI);
    @Override
    public int read() throws IOException {
        try {
            return piInString.charAt(position++);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            throw new IOException("Too precise data requested") ;
        }
    }
}
