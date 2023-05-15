import java.io.FileWriter;
import java.io.PrintWriter;

public class Udskrift {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("TCP_GRIN120.Global.iff.com");
            PrintWriter printerWriter = new PrintWriter(fileWriter);

            printerWriter.println("Dette er det output, der skal printes.");
            printerWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

