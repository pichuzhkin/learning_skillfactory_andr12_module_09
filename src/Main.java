import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PiNumberStream s = new PiNumberStream();
        for( int i = 0;i<=8;i++)
        {

            System.out.print((char) s.read());
        }
    }
}
